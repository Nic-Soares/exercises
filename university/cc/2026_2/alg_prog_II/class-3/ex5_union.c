/*
Escreva uma função que recebe dois vetores inteiros A[] e B[], em seguida, a sua função imprime a UNIÃO entre os vetores, ou seja, os elementos do vetor A mais aos elementos do vetor B, desconsiderando os números repetidos de A em B. Os vetores dados não possuem valores duplicados e não estão ordenados. 

Exemplo: 
A[] = { 7, 2, 5, 8, 4} e B[] = {4, 2, 9, 5} 
então A È B= {7, 2, 5, 8, 4, 9} 

A[] = { 3, 9, 11} e B[]= {2, 6, 1} 
então A È B = {3, 9, 11, 2, 6, 1}
 */

#include <stdio.h>

void unionFunction (int v1[], int n1, int v2[], int n2) {
  for (int i = 0; i < n1; i++) {
    printf("%d ", v1[i]);
  }
  for (int j = 0; j < n2; j++) {
    int found = 0;
    for (int i = 0; i < n1; i++) {
      if (v1[i] == v2[j]) {
        found = 1;  
      }
    }
    if (found == 0) {
      printf("%d ", v2[j]);
    }
  }
}

int main () {
  int v1[] = { 7, 2, 5, 8, 4 };
  int v2[] = { 4, 2, 9, 5 };
  int n1 = sizeof(v1) / sizeof(v1[1]);
  int n2 = sizeof(v2) / sizeof(v2[1]);

  unionFunction(v1, n1, v2, n2);
  
  return 0;
}