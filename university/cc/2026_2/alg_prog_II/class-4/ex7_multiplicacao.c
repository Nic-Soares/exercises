/*
(teoria 3b, Exercício 7)
Escreva uma função que recebe como parâmetros:
- a matriz A, com dimensões nxm;
- a matriz B, com dimensões mxp;
- e a matriz C, com dimensões nxp.
Sua função deve calcular a multiplicação de A por B e armazenar o
resultado em C.
*/

#include <stdio.h>

void multMatrix(int n, int m, int p, int matrixA[n][m], int matrixB[m][p], int matrixC[n][p]) {
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < p; j++) {
      matrixC[i][j] = 0;
      for (int k = 0; k < m; k++) {
        matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
      }
    }
  }
}

int main() {
  // Definindo as dimensões baseadas nos dados fornecidos
  int n = 2; // Linhas de A e C
  int m = 3; // Colunas de A, Linhas de B
  int p = 3; // Colunas de B e C

  int matrixA[2][3] = { 
    {1, 2, 3}, 
    {4, 5, 6} 
  };
  
  int matrixB[3][3] = { 
    {1, 2, 3}, 
    {1, 2, 3}, 
    {1, 2, 3} 
  };
  
  int matrixC[2][3] = {0}; // Resultado será nxp (2x3)

  // Passa as dimensões exatas para alinhar corretamente na memória
  multMatrix(n, m, p, matrixA, matrixB, matrixC);

  // A impressão deve respeitar os limites i < n e j < p
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < p; j++) {
      printf("%3d ", matrixC[i][j]);
    }
    printf("\n");
  }

  return 0;
}