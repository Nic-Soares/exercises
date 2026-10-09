/*
 * AP2-S002-Q3 · somaPotencias (sem pow, sem consulta)
 *
 * O que a funcao faz: devolve base^0 + base^1 + base^2 + ... + base^n.
 * Exemplo: somaPotencias(2, 3) = 1 + 2 + 4 + 8 = 15.
 *
 * PLANO EM PORTUGUES (preencha antes de escrever codigo):
 *   1. A soma comeca em ______ porque ______________________.
 *   2. A potencia atual comeca em ______ porque base elevado a 0 vale ______.
 *   3. O laco roda com k indo de ______ ate ______ (quantas voltas para n = 3? ______).
 *   4. Em cada volta, primeiro ______________________ e depois ______________________.
 *      (a ordem importa: qual das duas garante que o 1 entra na soma?)
 *   5. No fim, retorna ______.
 *
 * PREVISAO (antes de rodar), para somaPotencias(3, 2):
 *   voltas: ____   valores da potencia em cada volta: ____   retorno: ____
 *
 * DEPOIS DE RODAR: bateu? ____
 */
#include <stdio.h>

int somaPotencias(int base, int n) {
    /* escreva aqui, sem pow, com um comentario em cada linha dizendo o que ela faz
       e um printf de rastreio dentro do laco:
       printf("   [rastreio] k=%d potencia=%d soma=%d\n", ...); */
}

int main() {
    printf("somaPotencias(2, 3) = %d (esperado 15)\n", somaPotencias(2, 3));
    printf("somaPotencias(3, 2) = %d (esperado 13)\n", somaPotencias(3, 2));
    printf("somaPotencias(5, 0) = %d (esperado 1)\n", somaPotencias(5, 0));
    printf("somaPotencias(1, 4) = %d (esperado 5)\n", somaPotencias(1, 4));
    printf("somaPotencias(10, 2) = %d (esperado 111)\n", somaPotencias(10, 2));
    return 0;
}
