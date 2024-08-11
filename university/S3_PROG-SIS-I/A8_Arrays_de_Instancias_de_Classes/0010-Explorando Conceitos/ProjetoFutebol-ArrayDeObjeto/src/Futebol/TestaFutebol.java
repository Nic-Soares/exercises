package Futebol;
import java.util.Scanner;

public class TestaFutebol {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int op;
    Time time1 = new Time("Sport Club Brazil");
    System.out.printf("Estadios que o time %s pode jogar ", time1.getNome());

    do {
      System.out.print("\nMenu\n1-Cria Estadio\n2-Mostra estadio do time\n3-Sair\n");
      op = input.nextInt();
      if (op == 3){
        break;
      }
      switch (op) {
        case 1 -> {
          System.out.println("Nome do Estadios:");
          String nome = input.next();
          System.out.println("Capacidade de Estadio:");
          int capacidade = input.nextInt();
          System.out.println("Ano de Inauguraçao do Estadio");
          int ano = input.nextInt();
          if (time1.criarEstadio(nome, capacidade, ano))
            System.out.println("Estadio cadastrado");
          else
            System.out.println("Excedeu limite de estadios");
        }
        case 2 -> {
          time1.getInfoEstadios();
          break;
        }
      }
    }while(op != 3);
  }
}
