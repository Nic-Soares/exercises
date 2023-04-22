//Este algoritmo tem complexidade QUADRÁTICA, ou seja, O(n2). Se n dobra, o número de operações quadruplica.
public class MetodoDeOrdenacaoBubbleSort {

  public static void main(String[] args) {

    int[] lista = new int[50];
    sorteia(lista);
    bubbleSort(lista);
    exibe(lista);
  }

  public static void sorteia(int[] lista) {
    // sorteia valores para o vetor e os exibe na tela
    System.out.println("Vetor antes da ordenação");
    for (int i = 0; i < lista.length; i++) {
      lista[i] = (int) (100 * Math.random());
      System.out.print(lista[i] + " ");
    }
  }

  public static void bubbleSort(int[] lista) {
    int temp;
    // inicia o Bubble Sort
    for (int i = 0; i < lista.length; i++) {
      for (int j = 1; j < lista.length - i; j++) {
        if (lista[j - 1] > lista[j]) {
          //troca os elementos
          temp = lista[j - 1];
          lista[j - 1] = lista[j];
          lista[j] = temp;
        }
      }
    }
  }

  public static void exibe(int[] lista) {
    // exibe vetor ordenado
    System.out.println("\nVetor após a ordenação");
    for (int i = 0; i < lista.length; i++) {
      System.out.print(lista[i] + " ");
    }
  }
}