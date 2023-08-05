import java.util.*;

public class AlgoritmoDeBuscaSequencialEBinaria {

  public static void main(String[] args) {

    Scanner ent = new Scanner(System.in);

    int[] vetor = new int[100];
    preencheVetor(vetor);
    System.out.println("Qual valor deseja procurar no vetor (entre 0 e 200)");
    int valor = ent.nextInt();
    int metodo;
    System.out.println("\nQual método de busca quer usar? 1-Linear 2-Binária");
    do {
      metodo = ent.nextInt();
    } while (metodo < 1 || metodo > 2);

    int resp;
    if (metodo == 1) {
      mostraVetor(vetor);
      resp = buscaLinear(vetor, valor);

    } else {
      ordenaBubble(vetor);
      mostraVetor(vetor);
      resp = buscaBinaria(vetor, valor);
    }
    if (resp == -1) {
      System.out.printf("\nO valor %d não existe no vetor", valor);
    } else {
      System.out.printf("\nO valor %d está na posição %d do vetor", valor, resp);
    }

  }

  public static void preencheVetor(int[] vet) {
    for (int i = 0; i < vet.length; i++) {
      vet[i] = (int) (Math.random() * 200);
    }
  }

  public static void mostraVetor(int[] vet) {
    for (int i = 0; i < vet.length; i++) {
      System.out.print(vet[i] + "\t");
    }
  }

  public static int buscaLinear(int[] vet, int valor) {
    for (int i = 0; i < vet.length; i++) {
      if (vet[i] == valor) {
        return i;
      }
    }
    return -1;
  }

  public static void ordenaBubble(int[] vet) {
    int temp;
    // inicia o Bubble Sort
    for (int i = 0; i < vet.length; i++) {
      for (int j = 1; j < vet.length - i; j++) {
        if (vet[j - 1] > vet[j]) {
          //troca os elementos
          temp = vet[j - 1];
          vet[j - 1] = vet[j];
          vet[j] = temp;
        }
      }
    }
  }

  public static int buscaBinaria(int[] vet, int valor) {
    int inf, sup, meio;
    inf = 0;
    sup = vet.length - 1;
    while (inf <= sup) {
      meio = (inf + sup) / 2;
      if (valor == vet[meio]) {
        return meio;
      } else if (valor < vet[meio]) {
        sup = meio - 1;
      } else {
        inf = meio + 1;
      }
    }
    return -1;
    /* não encontrado */
  }

}