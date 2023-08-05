import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // cria uma instância da classe FuncionarioDao
        FuncionarioDAO funcionarioDao = new FuncionarioDAO();

        // solicita ao usuário que digite os dados do novo funcionário
        System.out.println("Digite os dados do novo funcionário:");

        System.out.print("Número de matrícula: ");
        long numat = input.nextLong();

        input.nextLine();

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Salário: ");
        double salario = input.nextDouble();

        input.nextLine();

        System.out.print("Sexo: ");
        String sexo = input.nextLine();

        System.out.print("Número do departamento: ");
        int ndepto = input.nextInt();

        System.out.print("Número do supervisor: ");
        long nsuper = input.nextLong();

        // cria uma instância da classe Funcionario com os dados informados
        Funcionario novoFuncionario = new Funcionario(numat, nome, salario, sexo, ndepto, nsuper);

        // adiciona o novo funcionário
        funcionarioDao.adiciona(novoFuncionario);

        // obtém a lista atualizada de funcionários
        ArrayList<Funcionario> listaFuncionarios = (ArrayList<Funcionario>) FuncionarioDAO.getLista();

        // imprime a lista atualizada de funcionários
        System.out.println("\nLista de funcionários atualizada:\n");
        for (Funcionario f : listaFuncionarios) {
            System.out.println(f);
        }

        input.close();
    }

}
