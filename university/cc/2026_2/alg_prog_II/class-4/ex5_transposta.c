/*
(teoria 3b, Exercício 5)
Dada uma matriz A, a transposta desta matriz é uma matriz que tem
as colunas da matriz A como rowhas.

Desenvolva uma função com a assinatura
  void transposta(int row, int col, int A[row][col], int At[col][row])
que devolva em At a transposta de A.
*/

#include <stdio.h>

/* Função corrigida com a assinatura exata do enunciado */
void transposta(int row, int col, int A[row][col], int At[col][row]) {
    int i, j;
    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            At[j][i] = A[i][j];
        }
    }
}

int main() {
    int row = 2, col = 3;
    
    /* Para usar lista de inicialização {}, as dimensões devem ser constantes. */
    int A[2][3] = {
        {1, 2, 3},
        {4, 5, 6}
    };
    
    /* A matriz que vai receber o resultado pode ter tamanho variável (VLA) */
    int At[col][row];

    /* Chama a função passando as matrizes e dimensões */
    transposta(row, col, A, At);

    printf("Matriz original:\n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            printf("%2d ", A[i][j]);
        }
        printf("\n");
    }

    printf("\nMatriz transposta:\n");
    for (int i = 0; i < col; i++) {
        for (int j = 0; j < row; j++) {
            printf("%d ", At[i][j]);
        }
        printf("\n");
    }

    return 0;
}