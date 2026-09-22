/*
Escreva um programa que recebe um vetor de número inteiros, e verifica se os elementos do vetor estão em ordem crescente. A função retorna true se estiver em ordem crescente e false, caso contrário.
 */

#include <stdio.h>

int verifyVetor (int v[], int n) {
  for (int i = 0; i < n - 1; i++) {
    if (v[i] > v[i + 1]) {
      return 0;
    }
  }
  return 1;
}

int main () {
  int v[] = {1, 2, 4, 3, 5};
  int n = sizeof(v) / sizeof(v[0]);

  if (verifyVetor(v, n)) {
    printf("This vector is sorted");
  } else {
    printf("This vector is not sorted");    
  }
}