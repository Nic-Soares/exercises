/*
(teoria 3b, Exercício 3)
Quando a matriz é quadrada nela podemos perceber a presença de uma
diagonal secundária e uma diagonal principal. Crie uma função que
recebe uma matriz quadrada e devolve a soma dos valores da diagonal
secundária.
*/

#include <stdio.h>
#define MAX 100

int calcTraco (int n, int matrix[n][n]) {
  int calc = 0;
  for (int i = 0; i < n; i++) { // 0,2 | 1,1 | 2,0 
    calc += matrix[i][n - 1 - i];
  }
  return calc;
}

int main () {
  int matrix[3][3] = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
  };

  int n = 3; // é a matriz quadrada

  printf("%d", calcTraco(n, matrix));

  return 0;
}
