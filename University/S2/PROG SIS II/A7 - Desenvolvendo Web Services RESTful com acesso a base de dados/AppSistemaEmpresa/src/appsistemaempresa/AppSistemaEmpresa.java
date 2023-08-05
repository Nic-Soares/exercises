package appsistemaempresa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nicolas
 */
public class AppSistemaEmpresa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Numat: ");
        funcionario.setNumat(Integer.parseInt(ler.nextLine()));
        System.out.println("Nome: ");
        funcionario.setNome(ler.nextLine());
        System.out.println("Salario: ");
        funcionario.setSalario(Double.parseDouble((ler.nextLine())));
        System.out.println("Sexo: ");
        funcionario.setSexo(ler.nextLine().charAt(0));
        System.out.println("Ndepto: ");
        funcionario.setNdepto(Integer.parseInt(ler.nextLine()));
        System.out.println("NSuper: ");
        funcionario.setNsuper(Integer.parseInt(ler.nextLine()));
        FuncionarioDAO dao = new FuncionarioDAO();
        ArrayList <Funcionario> listaFuncionario = dao.getLista();
        for (Funcionario f:listaFuncionario){
            System.out.println("Numat: " + f.getNumat() + "\n" + "Nome: " + f.getNome() + "\n" + "Salario: " + f.getSalario() + "\n" + "Sexo: " + f.getSexo() + "\n" + "NDepto: " + f.getNdepto() + "\n" + "NSuper: " + f.getNsuper());
        }
    }
    
}