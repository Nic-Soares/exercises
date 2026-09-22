/*
(teoria 5, Exercício 2 — slide 33)
Desenvolva uma função com a assinatura:
    int busca_binaria(int v[], int n, int e);
mesma assinatura e mesmo contrato de retorno do Exercício 1 (índice
de "e" em "v", ou -1 se não existir), mas implementando o algoritmo
de busca binária.

Escreva também um programa que:
    1. gera um vector pseudo-aleatório ORDENADO de 10 elementos, cada
    um entre 1 e 100 (a busca binária exige o vector ordenado);
    2. busca, nesse vector, os mesmos 5 valores do Exercício 1 (10,
       15, 60, 65 e 90), imprimindo o resultado de cada busca.

Existe gabarito do professor para este exercício em
"Exercícios resolvidos — busca (teoria 5)/exercicio2_busca_binaria.c"
(no cofre, inclui uma função ordenar() com bubble sort só para
preparar o vector) — resolva primeiro, com o material fechado, e só
depois compare.
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int drawNumber () {
  int min = 1, max = 100;
  return min + rand() % (max - min + 1);
}

void sortFunction(int vector[], int size) {
    int aux;

    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (vector[j] > vector[j + 1]) {
              aux = vector[j];
              vector[j] = vector[j + 1];
              vector[j + 1] = aux;
            }
        }

        printf("Vetor ordenado %d: ", i + 1);
        for(int k = 0; k < size; k++) {
            printf("%d ", vector[k]);
        }
        printf("\n");
    }
}

void feedRandomVector (int randomVector[]) {
  for (int i = 0; i < 10; i++) {
    randomVector[i] = drawNumber();
    printf("%2d ", randomVector[i]);
  }

  sortFunction(randomVector, 10);
}

int performingBinarySearch (int randomVector[], int n, int e){
  int start = 0, end = n - 1;

  while (start <= end) {
    int middle = (start + end) / 2;
    if (randomVector[middle] == e) {
      return middle;
    } else if (randomVector[middle] < e){
      start = middle + 1;
    } else {
      end = middle - 1; 
    }
  }

  return -1;

}

int main () {
  srand(time(NULL));
  int chosenNumbers[] = {10, 15, 60, 65, 90};
  int randomVector[10];
  int foundNumber = 0;
  
  printf("Alimentando vetor com números aleatórios de 1 a 100: \n");
  feedRandomVector(randomVector);

  for (int i = 0; i< 5; i++) {
   foundNumber = performingBinarySearch(randomVector, 10, chosenNumbers[i]);

   if (foundNumber == -1) {
      printf("Número %d não encontrado no vetor aleatório.\n", chosenNumbers[i]);
   } else {
      printf("Número %d encontrado na posição %d, do vetor aleatório. \n", chosenNumbers[i], foundNumber);
   }
  }

  
  return 0;
}