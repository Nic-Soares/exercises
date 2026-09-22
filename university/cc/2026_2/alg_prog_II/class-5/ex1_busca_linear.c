/*
(teoria 5, Exercício 1 — slide 18)
Desenvolva uma função com a assinatura:
    int busca_linear(int v[], int n, int e);
que devolve o índice da primeira ocorrência de "e" no vetor "v" de
tamanho "n", ou -1 se "e" não existir no vetor.

Escreva também um programa que:
    1. gera um vetor pseudo-aleatório de 10 elementos, cada um entre
       1 e 100 (use srand/rand);
    2. busca, nesse vetor, os valores 10, 15, 60, 65 e 90, imprimindo
       o resultado de cada busca.

Existe gabarito do professor para este exercício em
"Exercícios resolvidos — busca (teoria 5)/exercicio1_busca_linear.c"
(no cofre) — resolva primeiro, com o material fechado, e só depois
compare.
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int busca_linear(int v[], int n, int e) {
  for (int i = 0; i < n; i++) {
    if (v[i] == e) {
      return i;
    }
  }
  return -1;
}

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

void performingLinearSearch (int randomVector[], int chosenNumbers[]) {
  int foundNumber = 0;
  
  printf("Alimentando vetor com números aleatórios de 1 a 100: \n");
  feedRandomVector(randomVector);

  printf("Buscando numeros escolhidos no vetor aleatório: \n");
  for (int i = 0; i < 5; i++) {
    foundNumber = busca_linear(randomVector, 10, chosenNumbers[i]);
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

  performingLinearSearch(randomVector, chosenNumbers);
  
}

