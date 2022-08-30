package com.dh.ecommerceMVC.dao.impl;

import com.dh.ecommerceMVC.dao.ConfigJDBC;
import com.dh.ecommerceMVC.dao.Idao;
import com.dh.ecommerceMVC.model.Product;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.LogManager.getLogger;


@Configuration
public class ProductDAOH2 implements Idao<Product> {

    final static Logger log = getLogger(ProductDAOH2.class);
    private ConfigJDBC configJDBC;

    @Override
    public Product save(Product product) throws SQLException {
        log.info("Creating connection");
        String sqlInsert = String.format("INSERT INTO PRODUCTS (NAME, PRICE)" +
                "VALUES ('%s', '%s')", product.getName(), product.getPrice());
        Connection connection = null;
        try {
            log.info("Saving product" + product.getName());
            configJDBC = new ConfigJDBC("org.h2.Driver", "jdbc:h2:mem:testdb;" + "INIT=RUNSCRIPT FROM 'create,sql'", "sa", "");
            connection = configJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                product.setId(result.getInt(1));
            }
        } catch (Exception e) {
            log.error("Error");
            e.printStackTrace();
        } finally {
            log.info("Closing connection");
            connection.close();
        }
        return product;
    }

    @Override
    public List<Product> getAll() throws SQLException {
        log.info("Creating connection");
        Connection connection = null;
        String sqlSelect = "SELECT * FROM PRODUCTS";
        List<Product> products = new ArrayList<>();
        try {
            configJDBC = new ConfigJDBC("org.h2.Driver", "jdbc:h2:mem:testdb;" + "INIT=RUNSCRIPT FROM 'create,sql'", "sa", "");
            connection = configJDBC.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlSelect);
            log.debug("Getting all products");
            while (result.next()) {
                products.add(createProduct(result));
            }
        } catch (SQLException e) {
            log.error("Error");
            e.printStackTrace();
        } finally {
            log.info("Closing connection");
            connection.close();
        }
        return products;
    }

    @Override
    public void update(Product product) throws SQLException {
        log.info("Creating connection");
        Connection connection = null;
        String sqlUpdate = String.format("UPDATE PRODUCTS SET PRICE = '%S' WHERE ID = '%S';", product.getPrice(), product.getId());
        try {
            log.info("Updating product's price");
            configJDBC = new ConfigJDBC("org.h2.Driver", "jdbc:h2:mem:testdb;" + "INIT=RUNSCRIPT FROM 'create,sql'", "sa", "");
            connection = configJDBC.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlUpdate);

        } catch (SQLException e) {
            log.error("Error");
            e.printStackTrace();
        } finally {
            log.info("Closing connection");
            connection.close();
        }
    }

    @Override
    public Optional<Product> getById(int id) throws SQLException {
        log.info("Creating connection");
        Connection connection = null;
        Product product = null;
        String sqlSelectById = String.format("SELECT * FROM PRODUCTS WHERE ID = %S", id);
        try {
            log.info("Getting product by ID");
            configJDBC = new ConfigJDBC("org.h2.Driver", "jdbc:h2:mem:testdb;" + "INIT=RUNSCRIPT FROM 'create,sql'", "sa", "");
            connection = configJDBC.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlSelectById);
            while (result.next()) {
                product = createProduct(result);
            }
        } catch (SQLException e) {
            log.error("Error");
            e.printStackTrace();
        } finally {
            log.info("Closing connection");
            connection.close();
        }
        return product != null ? Optional.of(product) : Optional.empty();
    }

    @Override
    public void delete(int id) throws SQLException {
        log.info("Creating connection");
        Connection connection = null;
        String sqlDelete = String.format("DELETE FROM PRODUCTS WHERE ID = %s", id);
        try {
            log.info("Deleting product");
            configJDBC = new ConfigJDBC("org.h2.Driver", "jdbc:h2:mem:testdb;" + "INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");
            connection = configJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery(sqlDelete);
        } catch (SQLException e) {
            log.error("Error");
            e.printStackTrace();
        } finally {
            log.info("Closing connection");
            connection.close();
        }
    }

    private Product createProduct(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("ID");
        String name = resultSet.getString("NAME");
        double price = resultSet.getDouble("PRICE");
        return new Product(id,name,price);
    }
}
