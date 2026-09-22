/*
(teoria 3b, Exercício 4)
Para que uma matriz tenha diagonal ela deverá ser uma matriz
quadrada, ou seja, N=M. Uma matriz diagonal é uma matriz quadrada
onde os elementos que não pertencem à diagonal principal são
obrigatoriamente iguais a zero. Obs: isso não impede que os
elementos que pertencem à diagonal principal sejam iguais a zero,
ou seja, uma matriz onde todos os seus elementos são iguais a zero
é uma matriz diagonal.
Crie uma função em C que receba uma matriz e verifica se a matriz é
uma matriz diagonal. Obs: sua função deve retornar True caso seja
uma matriz diagonal e False caso contrário.
*/


#include <stdio.h>

int isDiagonalMatrix(int n, int matrix[n][n]) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            // Se não for a diagonal principal (i != j) e o valor for diferente de 0,
            // então não é uma matriz diagonal. Retorna 0 (Falso).
            if (i != j && matrix[i][j] != 0) {
                return 0;
            }
        }
    }
    // Se percorreu tudo e não encontrou nenhum erro, retorna 1 (Verdadeiro).
    return 1;
}

int main () {
  int matrix1[3][3] = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
  };
  int matrix2[3][3] = {
      {1, 0, 0},
      {0, 5, 0},
      {0, 0, 9}
  };
  int n = 3;

  // Testando e imprimindo os resultados (1 = True, 0 = False)
  printf("Matriz 1 e diagonal? %d\n", isDiagonalMatrix(n, matrix1));
  printf("Matriz 2 e diagonal? %d\n", isDiagonalMatrix(n, matrix2));
}
