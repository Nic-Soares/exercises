import java.util.Scanner;
public class MenuOpcoes {
  public static int menu() {
    Scanner input = new Scanner(System.in);
    int op;
    System.out.println("Opçoes\n1 Média entre os  números digitados\n" + 
                               "2 Diferença do maior pelo menor\n" +
                               "3 Produto entre os números digitados\n" +
                               "4 Divisao do primeiro pelo segundo\n" +
                               "5 Sair");
    
    op = input.nextInt();
    return op;
  }

  public static double media (int n1, int n2){
    double m;
    m = (double) (n1+n2)/2;
    return m;
  }

  public static int diferenca(int n1, int n2) {
    if (n1>n2)
      return(n1-n2);
    else
      return(n2-n1);
  }

  public static int produto(int n1, int n2) {
    return (n1*n2);
  }

  public static double divisao(int n1, int n2) {
    return (double)n1/n2;
  }

  public static void main(String[] args) {
    double m;
    int n1, n2, op;
    Scanner input = new Scanner (System.in);
    System.out.println("Digite 2 números:");
    n1 = input.nextInt();
    n2 = input.nextInt();
    do{
      op = menu();
      switch (op){
        case 1:
          System.out.println("Média = " + media(n1, n2));
          break;
        case 2:
          System.out.println("Diferença = " + diferenca(n1, n2));
        case 3:
          System.out.println("Produto = " + produto(n1, n2));
          break;
        case 4:
          if (n2 != 0)
            System.out.println("Divisao = " + divisao(n1, n2));
          else
            System.out.println("Nao há divisao por zero");
          break;
        case 5:
          System.out.println("Prgrama finalizado");
          break;
        case 6:
          System.out.println("Opçao Inválida");
      }   
    } while  (op!=5);
  }
}
