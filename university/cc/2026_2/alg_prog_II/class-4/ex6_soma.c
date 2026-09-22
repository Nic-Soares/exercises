/*
(teoria 3b, Exercício 6)
Escreva uma função que recebe como parâmetros três matrizes: A, B e
C, com n linhas e m colunas.
Sua função deve calcular a soma de A + B e armazenar o resultado na
matriz C.
*/


#include <stdio.h>

void sumMatrix (int row, int col, int matrixA[row][col], int matrixB[row][col], int matrixC[row][col]) {
  for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++) {
      matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
    }
  }
}

int main () {
  int matrixA[3][3] = { {1, 2, 3}, {1, 2, 3}, {1, 2, 3} };
  int matrixB[3][3] = { {1, 2, 3}, {1, 2, 3}, {1, 2, 3} };
  int matrixC[3][3];

  sumMatrix(3, 3, matrixA, matrixB, matrixC);

  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      printf("%2d ", matrixC[i][j]);
    }
    printf("\n");
  }

  return 0;
}