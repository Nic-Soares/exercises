/*
(teoria 5, Exercício 3 — slide 34)
Sem gabarito do professor para este.

Altere as funções de busca sequencial (linear) e busca binária dos
Exercícios 1 e 2 para que cada uma imprima quantas vezes o laço foi
executado até a função retornar uma resposta (encontrado ou -1).

Sugestão: use um contador incrementado a cada iteração do laço,
impresso ao final da busca — pode ser dentro da própria função de
busca ou devolvido por um parâmetro extra por referência.
*/


#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int drawNumber () {
  int min = 1, max = 100;
  return min + rand() % (max - min + 1);
}

void feedRandomVector (int randomVector[]) {
  for (int i = 0; i < 10; i++) {
    randomVector[i] = drawNumber();
    printf("%2d ", randomVector[i]);
  }
  printf("\n");
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
    }
}

void printVector(int vector[], int size) {
    for (int k = 0; k < size; k++) {
        printf("%2d ", vector[k]);
    }
    printf("\n");
}

int binarySearch (int randomVector[], int n, int e){
  int start = 0, end = n - 1, count = 0;

  while (start <= end) {
    count ++;
    int middle = (start + end) / 2;
    if (randomVector[middle] == e) {
      printf("Foram feitas %2d varreduras.\n", count);
      return middle;
    } else if (randomVector[middle] < e){
      start = middle + 1;
    } else {
      end = middle - 1; 
    }
  }

  printf("Foram feitas %2d varreduras.\n", count);
  return -1;

}
int linearSearch(int v[], int n, int e) {
  int count = 0;
  
  for (int i = 0; i < n; i++) {
    count ++;
    if (v[i] == e) {
      printf("Foram feitas %2d varreduras.\n", count);
      return i;
    }
  }

  printf("Foram feitas %2d varreduras.\n", count);
  return -1;
}

void performingLinearSearch (int randomVector[], int chosenNumbers[]) {
  int foundNumber = 0;

  printf("Buscando numeros escolhidos no vetor aleatório usando Busca Linear: \n");
  for (int i = 0; i < 5; i++) {
    foundNumber = linearSearch(randomVector, 10, chosenNumbers[i]);
    if (foundNumber == -1) {
      printf("Número %d não encontrado no vetor aleatório.\n", chosenNumbers[i]);
    } else {
      printf("Número %d encontrado na posição %d, do vetor aleatório. \n", chosenNumbers[i], foundNumber);
    }
  }
}

void performingBinarySearch (int randomVector[], int chosenNumbers[]) {
  int foundNumber = 0;

  printf("Ordenando vetor antes de realizar busca binária:\n");
  sortFunction(randomVector, 10);
  printVector(randomVector, 10);

  printf("Buscando numeros escolhidos no vetor aleatório usando Busca Binária: \n");
  for (int i = 0; i< 5; i++) {
   foundNumber = binarySearch(randomVector, 10, chosenNumbers[i]);

   if (foundNumber == -1) {
      printf("Número %d não encontrado no vetor aleatório.\n", chosenNumbers[i]);
   } else {
      printf("Número %d encontrado na posição %d, do vetor aleatório. \n", chosenNumbers[i], foundNumber);
   }
  }
}

int main () {
  srand(time(NULL));
  int chosenNumbers[] = {10, 15, 60, 65, 90};
  int randomVector[10];

  printf("Alimentando vetor com números aleatórios de 1 a 100: \n");
  feedRandomVector(randomVector);

  performingLinearSearch(randomVector, chosenNumbers);
  performingBinarySearch(randomVector, chosenNumbers);
  
  return 0;
}