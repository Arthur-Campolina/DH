import java.sql.*;

public class Main {

    private static final String sqlCreateTabl = " DROP TABLE IF EXISTS Animal; CREATE TABLE Animal;" +
            "(" + "ID INT PRIMARY KEY,"
            + "NOME VARCHAR(100) NOT NULL,"
            + "TIPO VARCHAR(100) NOT NULL"
            + ")";

    private static final String sqlInsert1 = "INSERT INTO Animal VALUES (1, 'Meg', 'Dog');";
    private static final String sqlInsert2 = "INSERT INTO Animal VALUES (2, 'Bob', 'Dog');";
    private static final String sqlInsert3 = "INSERT INTO Animal VALUES (3, 'Dope', 'Cat');";
    private static final String sqlInsert4 = "INSERT INTO Animal VALUES (4, 'Twit', 'Bird');";
    private static final String sqlInsert5 = "INSERT INTO Animal VALUES (5, 'Campolina', 'Horse');";

    private static final String sqlDelete1 = "DELETE FROM Animal WHERE ID = 1";

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            Statement statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection == null) {
                System.out.println("No connection");
            }
            assert connection != null;
            connection.close();
        }
    }

    private static void showAnimal(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM Animla";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + resultSet.getString(3));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        //em user e password colocar as proprias credenciais
        return DriverManager.getConnection("jdbc:h2:~/test","sa", "");
    }
}
