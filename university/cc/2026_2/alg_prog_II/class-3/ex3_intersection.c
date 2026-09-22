/*
Escreva uma função que recebe dois vetores inteiros A[] e B[], em seguida, a sua função imprime na
tela os valores referentes à INTERSECÇÃO entre os vetores, ou seja, os elementos em comum entre os
dois vetores. Considere que os vetores dados não possuem valores duplicados e não estão ordenados.
A[] = { 7, 2, 5, 8, 4} e B[]= {4, 2, 9, 5} então A ∩ B = {2, 5, 4}
A[] = { 3, 9, 11} e B[]= {2, 6, 1} então A ∩ B = {}
*/

#include <stdio.h>

void intersectionFunction(int v1[], int n1, int v2[], int n2) {
  for (int i = 0; i < n1; i++) {
    for (int j = 0; j < n2; j++) {
      if (v1[i] == v2[j]) {
        printf("%d ", v1[i]);
      }
    }
  }
}

int main () {
  int v1[] = {7, 2, 5, 8, 4};
  int v2[] = {4, 2, 9, 5};
  int n1 = sizeof(v1) / sizeof(v1[0]);
  int n2 = sizeof(v2) / sizeof(v2[0]);

  intersectionFunction(v1, n1, v2, n2);
}
