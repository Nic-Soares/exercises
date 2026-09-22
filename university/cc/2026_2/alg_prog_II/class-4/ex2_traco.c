/*
(teoria 3b, Exercício 2)
O traço de uma matriz é a soma dos elementos de sua diagonal
principal. Implemente uma função que recebe uma matriz quadrada, ou
seja, número de linhas igual ao número de colunas, e devolva o seu
traço.
*/

#include <stdio.h>
#define MAX 100

int calcTraco (int n, int matrix[n][n]) {
  int calc = 0;
  for (int i =0; i < n; i++) {
    calc += matrix[i][i];
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
