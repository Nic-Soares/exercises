/*
  Repita o exercício anterior, agora deve ser impresso os elementos que estão em A[] mas não estão em B[], ou seja, a diferença de A – B, por exemplo: A[] = { 7, 2, 5, 8, 4} e B[]= {4, 2, 9, 5} então A – B = {7, 8 } A[] = { 3, 9, 11} e B[]= {2, 6, 1} então A – B= {3, 9, 11}
 */

#include <stdio.h>

void differenceFunction (int v1[], int n1, int v2[], int n2) {
  
  for (int i = 0; i < n1; i++) {
    int found = 0;
    for (int j = 0; j < n2; j++) {
      if (v1[i] == v2[j]) {
        found = 1;
      }
    }
    if (found == 0) {
      printf("%d ", v1[i]);
    }
  }
}

int main () {
  int v1[] = {7, 2, 5, 8, 4};
  int v2[] = {4, 2, 9, 5};
  int n1 = sizeof(v1) / sizeof(v1[1]);
  int n2 = sizeof(v2) / sizeof(v2[1]);

  differenceFunction(v1, n1, v2, n2);

  return 0;
}