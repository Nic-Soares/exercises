package appsistemaempresa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            Connection conexao = DriverManager.getConnection(
            "jdbc:derby://localhost:1527/empresa", 
            "app", 
            "app");
            return conexao;
        } catch (SQLException ex) {
            System.out.print("Falha de conexao ao banco de dados! " + ex);
        }
        return null;
    }
}