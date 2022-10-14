import java.util.Scanner;

public class TesteBanco {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int op;
    Banco TecBanco = new Banco("Nubank", 2);
    do {
      System.out.println("(1) Criar nova conta no banco\n" + "(2) Soma dos saldos das contas \n" + "(3) Informaçoes do banco\n" + "(4) Sair\n" + "Escolha uma opçao: _");

      op = input.nextInt();
      switch (op){
        case 1:
          System.out.println("nome do correntista:");
          String nome = input.next();
          System.out.println("Saldo inicial de conta:");
          double saldo = input.nextDouble();
          if (nubank.maxConta) // problema
            System.out.println("\nBanco já atingiu o número maximo de contas!\n");
          break;

        case 2:
          System.out.println("Soma dos saldos:" + TecBanco.getSomaSaldos());
          break;

        case 3:
          System.out.println(TecBanco.toString());
          break;
      }
    } while (op != 4);

  }
}
