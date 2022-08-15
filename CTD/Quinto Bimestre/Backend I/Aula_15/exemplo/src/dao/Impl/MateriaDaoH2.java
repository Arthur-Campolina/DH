package dao.Impl;

import dao.ConfiguracaoJDBC;
import dao.IDao;
import model.Materia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MateriaDaoH2 implements IDao<Materia> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public MateriaDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Materia salvar(Materia materia) {
        Connection connection = configuracaoJDBC.conectarBancoDados();
        Statement statement = null;
        String querySalvar = String.format("INSERT INTO Materias (Nome) VALUES ('%S')", materia.getNome());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(querySalvar, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.getGeneratedKeys();
            while (result.next()) {
                materia.setId(result.getInt(1));
            }
            statement.close();
            connection.close();
        } catch (SQLException e ) {
            e.printStackTrace();
        }
        return materia;
    }

    @Override
    public List<Materia> buscarTodos() {
        Connection connection = configuracaoJDBC.conectarBancoDados();
        Statement statement = null;
        String queryBuscar = String.format("SELECT * FROM Materias");
        List<Materia> materias = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(queryBuscar);
            while (result.next()) {
                materias.add(new Materia(result.getInt("Id"), result.getString("Nome")));
            }
            statement.close();
            connection.close();
        } catch (SQLException e ) {
            e.printStackTrace();
        }
        return materias;
    }
}
