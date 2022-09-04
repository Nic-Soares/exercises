import java.util.Scanner;
public class DuasThreads {
  public static void main(String[] args) {
    // declaracao das variaveis
    int[] A;
    int i;
    int soma = 0;
    int tamanho = 100;

    //entrada dos valores digitados
    A = new int[tamanho];
    for (i = 0; i < tamanho; i++) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      A[i] = sc.nextInt();
    }


    //calculo da soma
    for (i = 0; i < tamanho; i++) {
      soma = soma + A[i];
    }

    //saida de dados
    for (i = 0; i < tamanho; i++) {
      Scanner sc = new Scanner(System.in);
      System.out.println("A[" + (i+1) + "] = " + A[i]);
    }

    System.out.println("Soma: " + soma);
  }

}
