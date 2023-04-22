
import java.util.Arrays;

public class MetodoDeOrdenacaoMergeSort {
  public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
      // calcula o ponto médio do vetor
      int middle = (left + right) / 2;

      // chama o mergeSort recursivamente para a metade esquerda
      mergeSort(arr, left, middle);
      // chama o mergeSort recursivamente para a metade direita
      mergeSort(arr, middle + 1, right);

      // mescla as duas metades ordenadas
      merge(arr, left, middle, right);
    }
  }

  public static void merge(int[] arr, int left, int middle, int right) {
    // calcula os tamanhos dos dois subvetores
    int n1 = middle - left + 1;
    int n2 = right - middle;

    // cria os dois subvetores
    int[] leftArr = new int[n1];
    int[] rightArr = new int[n2];

    // copia os elementos da metade esquerda para o subvetor esquerdo
    for (int i = 0; i < n1; ++i) {
      leftArr[i] = arr[left + i];
    }

    // copia os elementos da metade direita para o subvetor direito
    for (int j = 0; j < n2; ++j) {
      rightArr[j] = arr[middle + 1 + j];
    }

    // mescla os dois subvetores em ordem crescente
    int i = 0, j = 0, k = left;

    while (i < n1 && j < n2) {
      if (leftArr[i] <= rightArr[j]) {
        arr[k] = leftArr[i];
        i++;
      } else {
        arr[k] = rightArr[j];
        j++;
      }
      k++;
    }

    // copia os elementos restantes do subvetor esquerdo
    while (i < n1) {
      arr[k] = leftArr[i];
      i++;
      k++;
    }

    // copia os elementos restantes do subvetor direito
    while (j < n2) {
      arr[k] = rightArr[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    // cria um vetor com 50 elementos aleatórios
    int[] arr = new int[50];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (100 * Math.random());
    }
    // exibe o vetor antes da ordenação
    System.out.println("Vetor antes da ordenação: \n" + Arrays.toString(arr));
    // ordena o vetor usando o mergeSort
    mergeSort(arr, 0, arr.length - 1);
    // exibe o vetor após a ordenação
    System.out.println("Vetor após a ordenação: \n" + Arrays.toString(arr));
  }
}


