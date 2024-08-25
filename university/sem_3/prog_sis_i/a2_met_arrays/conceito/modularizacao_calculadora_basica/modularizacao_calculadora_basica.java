import java.util.Scanner;
public class Explorando_Conceito {
  public static double soma (double n1, double n2) {
    return (n1+n2);    
  }

  public static double subtrai (double n1, double n2) {
    return (n1-n2);
  }

  public static double multiplica (double n1, double n2) {
    return (n1*n2);
  }

  public static double divide (double n1, double n2) {
    return (n1/n2);
  }

  public static int menu(){
    Scanner entrada = new Scanner (System.in);
    System.out.println("1-Soma\n2-Subtraçao\n3-Multiplicaçao\n4-Divisao\n5-Sair");
    return (entrada.nextInt());
  }

  public static void main(String[] args) {
    double n1, n2;
    int op;
    Scanner entrada = new Scanner (System.in);
    System.out.println("Digite 2 números: ");
    n1 = entrada.nextDouble();
    n2 = entrada.nextDouble();
    do{
      op = menu();
      switch(op) {
        case 1: System.out.println("Soma = " + soma(n1, n2));
                break;
      }
    } while (op!=5);
  }
}
