/*
 * Ponteiros (teoria 6) - Exercicio 1
 *
 * Enunciado: qual e a saida do codigo abaixo?
 * Preveja no papel ANTES de compilar e rodar.
 */

#include <stdio.h>

int main(void)
{
    int i = 1234;
    int *p = &i;

    printf("*p = %d\n", *p);
    printf(" p = %ld\n", (long int)p);
    printf(" p = %p\n", (void *)p);
    printf("&p = %p\n", (void *)&p);
}
