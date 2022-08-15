import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Application {
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Usuarios; CREATE TABLE Usuarios "
            + "("
            + "Id INT PRIMARY KEY,"
            + "Nome VARCHAR(150) NOT NULL,"
            + "Email VARCHAR(250) NOT NULL,"
            + "Saldo NUMERIC (15, 2) NOT NULL"
            + ");";

    private static final String sqlInsert = "INSERT INTO Usuarios VALUES (?, ?, ?, ?)";
    private static final String sqlUpdate = "UPDATE Usuarios SET SALDO = ? WHERE Id = ?";

    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario("Arthur", "arthur.campolina@gmail.com", 1000d);
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            PreparedStatement insert = connection.prepareStatement(sqlInsert);
            insert.setInt(1, 1);
            insert.setString(2, usuario.getNome());
            insert.setString(3, usuario.getEmail());
            insert.setDouble(4, usuario.getSaldo());
            insert.execute();

            connection.setAutoCommit(false);

            PreparedStatement update = connection.prepareStatement(sqlUpdate);
            update.setDouble(1,usuario.addSaldo(1000d));
            update.setLong(2, usuario.getId());
            update.execute();

            connection.commit();
            connection.setAutoCommit(true);

            String sql = "SELECT * FROM Usuarios;";
            Statement select = connection.createStatement();
            ResultSet result = select.executeQuery(sql);
            while (result.next()) {
                System.out.println(result.getInt(1) + " " + result.getString(2)  + " " + result.getString(3)  + " " + result.getDouble(4));
            }


        } catch (Exception e){
            e.printStackTrace();
            assert connection != null;
            connection.rollback();
        } finally {
            assert connection != null;
            connection.close();
        }
    }

    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2~/test", "sa", "");
    }
}
