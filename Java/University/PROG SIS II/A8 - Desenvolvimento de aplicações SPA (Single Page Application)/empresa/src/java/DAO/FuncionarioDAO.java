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
    
    public boolean remove(int numat){
    
        String sql = "DELETE FROM Funcionario WHERE numat = ?";
        int funcionariosRemovidos = 0;
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setLong(1,numat);
            // executeUpdate retorna a quantidade de linhas removidas
            funcionariosRemovidos = stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // retorna true se removeu 1 aluno
        return funcionariosRemovidos == 1;
    }
    
    public boolean atualiza(Funcionario funcionario){
    String sql = "UPDATE Funcionario SET nome = ?, salario = ?, sexo = ?, ndepto = ?, nsuper = ? WHERE numat =?";
    int funcionarioAtualizados =0;
    
    try {
        // prepared statement para atualização
        PreparedStatement stmt = this.connection.prepareStatement(sql);
        // seta valores
        stmt.setString(1, funcionario.getNome());
        stmt.setDouble(2, funcionario.getSalario());
        stmt.setString(3, String.valueOf(funcionario.getSexo()));
        stmt.setInt(4, funcionario.getNdepto());
        stmt.setLong(5, funcionario.getNsuper());
        stmt.setInt(6, funcionario.getNumat());
        
        // executa atualização
        funcionarioAtualizados = stmt.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    // retorna true se atualizou 1 funcionário
    return funcionarioAtualizados == 1;
    }
    
}
