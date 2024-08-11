/*
Faça um programa em Java que crie um vetor com o preço de um determinado produto em 10 lojas.
Faça uma funçao que receba o vetor de preços como parâmetro e que calcula e retorna o preço médio deste produto, considerando
*/
import java.util.Scanner;
public class Produto {
  public static void entrada(double[] produto) {
   Scanner input = new Scanner(System.in);
   System.out.println("Digite o preço dos produtos\n");
   for (int i=0; i<produto.length; i++) {
    produto[i] = input.nextDouble();
    }
  }
  
  public static double precoMedio (double[] produto){
    double soma = 0;
    for (double valor: produto){
      soma+=valor;
    }
    return soma/10;
  }
  
  public static void main(String[] args) {
    double[] produto = new double[10];
    entrada(produto);
    System.out.println("Preço médio nas lojas=" + precoMedio(produto));
  }
}
