/*
 * Ponteiros (teoria 6) - Exercicio 4
 *
 * Enunciado: qual e a saida do codigo abaixo?
 * Preveja no papel ANTES de compilar e rodar.
 */

#include <stdio.h>

void imutavel(int x) { x += 10; }

void mutavel(int *x) { *x += 10; }

int main(void)
{
    int a = 0;
    printf("a: %d\n", a);
    imutavel(a);
    printf("a: %d\n", a);

    int b = 0;
    printf("b: %d\n", b);
    mutavel(&b);
    printf("b: %d\n", b);
}
