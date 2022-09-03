import java.util.Scanner;

public class TesteCliente {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Cliente c1 = new Cliente();
    System.out.println("Agency:");
    c1.agencia=input.nextInt();
    c1.conta = 23456;
    c1.nome = "XXX";
    c1.saldo = 1000;
    System.out.println("Saldo: " + c1.saldo);
    System.out.println("Valor do depósito: ");
    double v = input.nextDouble();
    c1.depositar(v);
    System.out.println("Saldo: " + c1.consultaSaldo());
  }
}
