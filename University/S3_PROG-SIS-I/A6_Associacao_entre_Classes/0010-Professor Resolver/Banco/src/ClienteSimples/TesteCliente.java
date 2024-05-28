package ClienteSimples;
import java.util.Scanner;

public class TesteCliente {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Cliente cliente1 = new Cliente("José da Silva", "00009999", 1234);
    cliente1.ctaCorrente.saldo=3000; //compoiçao
    System.out.println("Nome do cliente cadastrado: " + cliente1.nome);
    System.out.println("Saldo em conta corrente do cliente cadastrato: " + cliente1.ctaCorrente.saldo);
    cliente1.ctaCorrente.calculaCredito();
    System.out.println("Valor de crédito conta corrente: " + cliente1.ctaCorrente.credito);

    //abrir poupança
    Poupanca poup1 = new Poupanca(56767, 500);
    // Agregaçao ao cliente
    cliente1.abrirPoupanca(poup1);
    cliente1.ctaPoupanca.rendimento=0.5;
    cliente1.ctaPoupanca.calculaRendimento();
    System.out.println("Número da poupança: " + cliente1.ctaPoupanca.numero);
    System.out.println("Saldo em poupança do cliente cadastro: " + cliente1.ctaPoupanca.saldo);
  }
}
