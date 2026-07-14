import java.util.Arrays;

public class ShellSort {
    public static void shellSort(int[] array) {
        int n = array.length;
        int gap = n / 2;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
            gap /= 2;
        }
    }

    public static void main(String[] args) {
        int[] lista = {15, 167, 6, 1, 43, 0, 54, 9, 4};
        System.out.println("Original: " + Arrays.toString(lista));
        shellSort(lista);
        System.out.println("Ordenada: " + Arrays.toString(lista));
    }
}
