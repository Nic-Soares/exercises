package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionarioDAO {
    private Connection connection;

    public FuncionarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Funcionario funcionario) {
        String sql = "INSERT INTO funcionario VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            
            stmt.setLong(1, funcionario.getNumat());
            stmt.setString(2, funcionario.getNome());
            stmt.setDouble(3, funcionario.getSalario());
            stmt.setString(4, String.valueOf(funcionario.getSexo()));
            stmt.setInt(5, funcionario.getNdepto());
            stmt.setLong(6, funcionario.getNsuper());

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList <Funcionario> getLista() {
        String sql = "SELECT * FROM funcionario";
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setNumat(rs.getInt("numat"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setSalario(rs.getDouble("salario"));;
                funcionario.setSexo((rs.getString("sexo").charAt(0)));
                funcionario.setNdepto(rs.getInt("ndepto"));
                funcionario.setNsuper(rs.getInt("nsuper"));

                funcionarios.add(funcionario);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return funcionarios;
    }
    
    public Funcionario consulta(int numat){
        String sql = "SELECT * FROM Funcionario WHERE numat = ?";
        Funcionario funcionario = null;
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setLong(1, numat);
            ResultSet rs =stmt.executeQuery();
            if (rs.next()) {
                funcionario = new Funcionario();
                funcionario.setNumat(rs.getInt("numat"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setSalario(rs.getDouble("salario"));;
                funcionario.setSexo((rs.getString("sexo").charAt(0)));
                funcionario.setNdepto(rs.getInt("ndepto"));
                funcionario.setNsuper(rs.getInt("nsuper"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return funcionario;
    }
    
}
