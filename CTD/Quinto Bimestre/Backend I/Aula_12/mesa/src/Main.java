import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final String sqlCreateTable = "DROP IF EXISTS Funcionarios;" +
            "CREATE TABLE Funcionarios " +
            "(" +
            "id INT PRIMARY KEY, Nome VARCHAR(150) NOT NULL, Sobrenome VARCHAR(250) NOT NULL," +
            "Telefone VARCHAR(150) NOT NULL, Email VARCHAR(250) NOT NULL UNIQUE" +
            ")";

    private static final String sqlInsertData1 = "INSERT INTO Funcionarios" +
            "VALUES(1, 'Arthur', 'Campolina', '313441-8154', 'arthur.campolina@lenarge.com.br' )";
    private static final String sqlInsertData2 = "INSERT INTO Funcionarios" +
            "VALUES(1, 'João', 'Souza', '313441-5654', 'joao.souza@lenarge.com.br' )";
    private static final String sqlInsertData3 = "INSERT INTO Funcionarios" +
            "VALUES(2, 'Maria', 'Log', '313441-9985', 'maria.log@lenarge.com.br' )";
    private static final String sqlUpdate = "UPDATE Funcionarios SET Nome = 'João Carlos' WHERE id = 1";
    private static final String sqlDelete = "DELETE FROM Funcionarios WHERE id = 2";
    private static final String sqlDeleteError = "DELETE FROM Funcionarios WHERE Nome = Arthur";

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:h2:tcp//localhost/~/test", "sa", "");
            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);
            statement.execute(sqlInsertData1);
            statement.execute(sqlInsertData2);
            statement.execute(sqlInsertData3);
            statement.execute(sqlUpdate);
            statement.execute(sqlDelete);
            statement.execute(sqlDeleteError);

            logger.info("Excluido o usuário com o ID 2");
            logger.debug("Debug");

        } catch (SQLException e) {
                e.printStackTrace();
        } finally {
            if(connection == null) {
                return;
            }
            connection.close();
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:tcp//localhost/~/test", "sa", "");
    }


}
