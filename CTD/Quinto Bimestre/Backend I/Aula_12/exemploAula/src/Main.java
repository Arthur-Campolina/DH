import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

//    Instrução para pegar a tabela Usuário caso já exista, criar uma nova tebela
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario (id INT PRIMARY KEY, Primeiro_Nome VARCHAR(100) NOT NULL, Sobrenome VARCHAR(100) NOT NULL, Idade INT NOT NULL)";

//    Instruções para inserir dados na tabela Usuário
    private static final String sqlInsertData1 = "INSERT INTO Usuario VALUES (1, 'Arthur', 'Campolina', 31)";
    private static final String sqlInsertData2 = "INSERT INTO Usuario VALUES (2, 'João', 'Silva', 18)";
    private static final String sqlInsertData3 = "INSERT INTO Usuario VALUES (3, 'Márcio', 'Souza', 27)";
    private static final String sqlInsertData4 = "INSERT INTO Usuario VALUES (4, 'José', 'Márcio, 55')";
    private static final String sqlInsertData5 = "INSERT INTO Usuario VALUES (5, 'Joana', 'Bustamante', 25)";

//    Instruções para excluir registros na tabela usuário
    private static final String sqlDelete = "DELETE FROM Usuario WHERE id=5";

    private static final Logger logger = Logger,getLogger(Main.class);

    public static void main(String[] args) {
        Connection connection = null;

        try{

            connection = getConnection();
            Statement statement = connection.createStatement();

//     Executa a Instrução da criação da tabela no banco de dados
            statement.execute(sqlCreateTable);

//     Executa as instruções para inserir dados na tabela
            statement.execute(sqlInsertData1);
            statement.execute(sqlInsertData2);
            statement.execute(sqlInsertData3);
            statement.execute(sqlInsertData4);
            statement.execute(sqlInsertData5);

//     Executa as instruções para excluir dados na tabela
            statement.execute(sqlDelete);

//     Registra o log do usuário que foi excluido
            logger.info("Excluido o usuário com o ID 5");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(connection==null){
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
//catch(org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException e)
