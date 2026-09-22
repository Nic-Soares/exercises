/*
(teoria 3b, Exercício 1)
Escreva um programa em C que implemente:
A. Uma função verificaMaior(linhas, colunas, matriz) que recebe como parâmetro uma matriz de
   números inteiros e devolve o maior elemento encontrado na matriz.
B. Uma função criaMatriz(linhas, colunas, matriz) que preenche a matriz com números inteiros
   aleatórios (1 a 100).
C. main(): a função pede ao usuário que digite os valores para definir as dimensões da matriz, ou
   seja, linhas e colunas da matriz. Na sequência, chama as funções criaMatriz e verificaMaior e,
   por último, imprime a matriz gerada.
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX 100

int drawNumber() {
  int min = 1, max = 100;
  return min + rand() % (max - min + 1);
}

void createMatrix (int matrix[MAX][MAX], int rows, int columns) {
  for (int i = 0; i < rows; i++) {
    for (int j = 0;j < columns; j++) {
      matrix[i][j] = drawNumber();
    }
  }
}

int verifyBiggerNumber (int matrix[MAX][MAX], int rows, int columns) {
  int biggerNumber = 0;
  
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < columns; j++) {
      if (biggerNumber < matrix[i][j]) {
        biggerNumber =  matrix[i][j];
      }
    }
  }
  
  return biggerNumber;
}

int main () {
  int matrix[MAX][MAX];
  int rows, colunms;

  srand(time(NULL));

  printf("How many rows will your matrix here?");
  scanf("%d", &rows);

  printf("How many columns yout matriz here?");
  scanf("%d", &colunms);

  createMatrix (matrix, rows, colunms);

  printf("The largest number in your matrix is %d \n", verifyBiggerNumber(matrix, rows, colunms));

  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < colunms; j++) {
      printf("%2d ", matrix[i][j]);
    }
    printf("\n");
  }
  
  return 0;
}