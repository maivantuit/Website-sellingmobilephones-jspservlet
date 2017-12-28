package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author CỌP
 */
public class DBConnect {
    public static Connection getConnection() {
        Connection connect = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyWebsiteBanDienThoai;user=sa;password=123";
            connect = DriverManager.getConnection(connectionURL);
        } catch (ClassNotFoundException e) {
            System.out.println("Error connection ClassNotFoundException: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error connection SQLException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error connection: " + e.getMessage());            
        }
        return connect;
    }

    public static void main(String[] args) {        
        Connection con = getConnection();
        if(con!=null){
            System.out.println("Connect success!");
        }else{
            System.out.println("Connect fail!");
        }
    }
}
