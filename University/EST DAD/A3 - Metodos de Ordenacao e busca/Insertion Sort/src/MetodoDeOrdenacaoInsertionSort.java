// Esse algoritmo tem complexidade QUADRÁTICA, ou seja, O(n2). Se n dobra, o número de operações quadruplica.
public class MetodoDeOrdenacaoInsertionSort {

  public static void main(String[] args) {
    int[] lista = new int[50];
    geraVetor(lista);
    insertionSort(lista);
    exibeVetor(lista);
  }

  static void geraVetor(int[] lista) {
    System.out.println("Vetor antes da ordenação");
    for (int i = 0; i < lista.length; i++) {
      lista[i] = (int) (100 * Math.random());
      System.out.print(lista[i] + " ");
    }
  }

  static void insertionSort(int[] lista) {
    int j, aux;
    for (int i = 1; i < lista.length; i++) {
      aux = lista[i];
      for (j = i - 1; j >= 0 && aux < lista[j]; j--) {
        lista[j + 1] = lista[j];
      }
      lista[j + 1] = aux;
    }
  }

  static void exibeVetor(int[] lista) {
    System.out.println("\nVetor após ordenação");
    for (int i = 0; i < lista.length; i++) {
      System.out.print(lista[i] + " ");
    }
  }
}
