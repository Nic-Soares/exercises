/*
 * Ponteiros (teoria 6) - Exercicio 2
 *
 * Enunciado: por que o codigo abaixo esta errado?
 * Explique o bug antes de corrigir. Depois, escreva a versao corrigida
 * numa funcao separada (ex.: troca_corrigida) para comparar.
 */

#include <stdio.h>

void troca(int *i, int *j)
{
    int *temp = *i;
    *i = *j;
    *j = *temp;
}

int main(void)
{
    /* TODO: implemente troca_corrigida abaixo e teste aqui */
    return 0;
}
