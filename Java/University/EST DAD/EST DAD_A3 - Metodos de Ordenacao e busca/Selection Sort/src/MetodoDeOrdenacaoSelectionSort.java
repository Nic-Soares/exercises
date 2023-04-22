// Esse algoritmo tem complexidade QUADRÁTICA, ou seja, O(n2). Se n dobra, o número de operações quadruplica.

public class MetodoDeOrdenacaoSelectionSort {

  public static void main(String[] args) {
    int[] lista = new int[50];
    geraVetor(lista);
    selectionSort(lista);
    exibeVetor(lista);
  }

  static void geraVetor(int[] lista) {
    System.out.println("Vetor antes da ordenação");
    for (int i = 0; i < lista.length; i++) {
      lista[i] = (int) (100 * Math.random());
      System.out.print(lista[i] + " ");
    }
  }

  static void selectionSort(int[] lista) {
    int j, min, aux;
    for (int i = 0; i < lista.length - 1; i++) {
      min = i;
      for (j = i + 1; j < lista.length; j++) {
        if (lista[j] < lista[min]) {
          min = j;
        }
      }
      if (i != min) {
        aux = lista[i];
        lista[i] = lista[min];
        lista[min] = aux;
      }
    }
  }

  static void exibeVetor(int[] lista) {
    System.out.println("\nVetor após ordenação");
    for (int i = 0; i < lista.length; i++) {
      System.out.print(lista[i] + " ");
    }
  }

}