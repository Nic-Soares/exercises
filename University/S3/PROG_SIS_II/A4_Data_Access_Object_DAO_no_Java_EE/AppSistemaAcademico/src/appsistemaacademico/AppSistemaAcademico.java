/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appsistemaacademico;

/**
 *
 * @author Nicol
 */
import java.sql.*;

public class AppSistemaAcademico {
    
    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection(
            "jdbc:derby://localhost:1527/sistema_academico","app", "app");
            
            String SQL = "INSERT INTO aluno VALUES (?, ?, ?)";
            PreparedStatement stmt = conexao.prepareStatement(SQL);
            stmt.setInt(1, 123);
            stmt.setString(2, "Didatica Ruim");
            stmt.setDouble(3, 5.5);
            
            System.out.println("Linhas inseridas: " + stmt.executeUpdate());
            conexao.close();
            
        } catch (SQLException ex) {
            System.out. println("Falha de conexao ao banco de dados!");
        }
    }
    
}
