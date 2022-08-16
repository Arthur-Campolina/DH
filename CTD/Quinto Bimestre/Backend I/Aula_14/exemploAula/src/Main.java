import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final String sqlCreate = "DROP TABLE IF EXISTS Contas;"
            + "CREATE TABLE Contas"
            + "("
            + "Id INT PRIMARY KEY,"
            + "Nome VARCHAR(250) NOT NULL,"
            + "NumeroConta VARCHAR(200) NOT NULL,"
            + "Saldo NUMERIC(15, 2) NOT NULL"
            + ");";

    private static final String sqlInsert = "INSERT INTO Contas VALUES(?, ?, ?, ?);";

    private static final String sqlUpdate = "UPDATE Conta SET Saldo = ? WHERE Id = ?;";

    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta(1, "Arthur", "123456789", 100000d);
        Connection connection = null;

        try {
            connection = ConnectionJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreate);

            PreparedStatement insert = connection.prepareStatement(sqlInsert);
            insert.setInt(1, c1.getId());
            insert.setString(2, c1.getNome());
            insert.setString(3, c1.getNumConta());
            insert.setDouble(4, c1.getSaldo());
            insert.execute();

            PreparedStatement update1 = connection.prepareStatement(sqlUpdate);
            update1.setDouble(1, c1.aumentarSaldo(2000d));
            update1.setInt(2, c1.getId());
            update1.execute();

            connection.setAutoCommit(false);

            PreparedStatement update2 = connection.prepareStatement(sqlUpdate);
            update2.setDouble(1, c1.aumentarSaldo(15000d));
            update2.setInt(2, c1.getId());
            update2.execute();

//            int erro = 20/0;
            connection.commit();
            connection.setAutoCommit(true);

        } catch (SQLException e) {
            e.printStackTrace();
            assert connection != null;
            connection.rollback();
        }  finally {
            assert connection != null;
            connection.close();
        }
    }
}
