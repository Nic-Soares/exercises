import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:derby://localhost:1527/empresa", "app", "app");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}