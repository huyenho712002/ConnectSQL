
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thin1
 */
public class CreateConnection {

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost:1433; database = StudentManagent";
    private static String userName = "sa";
    private static String password = "123456";
    
    public static void main(String[] args) {
        try {
            createConnection(driver, dburl, userName, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static Connection createConnection(String driver, String dbURL, String userName,
            String password) throws SQLException {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(dburl, userName, password);
            System.out.println("Connect database thành công");
        } catch (ClassNotFoundException ex) {
            System.out.println("Connect database thất bại");
        }
        return con;
    }
}

