package com.dh.ecommerceMVC.service;

import com.dh.ecommerceMVC.dao.Idao;
import com.dh.ecommerceMVC.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    Idao<Product> productIdao;

    public Product save(Product product) throws SQLException {
       return productIdao.save(product);
    }

    public List<Product> getAll() throws SQLException {
        return productIdao.getAll();
    }

    public void update(Product product) throws SQLException {
        productIdao.update(product);
    }

    public Optional<Product> getById(int id) throws SQLException {
        return productIdao.getById(id);
    }

    public void delete(int id) throws SQLException {
        productIdao.delete(id);
    }
}
