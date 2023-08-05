import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private static Connection connection;

    public FuncionarioDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void adiciona(Funcionario funcionario) {
        String sql = "INSERT INTO funcionario (numat, nome, salario, sexo, ndepto, nsuper) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, funcionario.getNumat());
            stmt.setString(2, funcionario.getNome());
            stmt.setDouble(3, funcionario.getSalario());
            stmt.setString(4, String.valueOf(funcionario.getSexo()));
            stmt.setInt(5, funcionario.getNdepto());
            stmt.setLong(6, funcionario.getNsuper());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Funcionario> getLista() {
        String sql = "SELECT * FROM funcionario";
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setNumat(rs.getLong("numat"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setSalario(rs.getDouble("salario"));;
                funcionario.setSexo(String.valueOf(rs.getString("sexo").charAt(0)));
                funcionario.setNdepto(rs.getInt("ndepto"));
                funcionario.setNsuper(rs.getLong("nsuper"));

                funcionarios.add(funcionario);
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return funcionarios;
    }
}
