/*
 * AP2-S002-Q4 · Busca binaria do zero (sem consulta)
 *
 * PLANO EM PORTUGUES (preencha antes de escrever codigo):
 *   1. start comeca em ______ e end comeca em ______.
 *   2. O laco continua enquanto ______________________.
 *   3. A cada volta, middle = ______________________.
 *   4. Se v[middle] == alvo: ______________________.
 *   5. Se v[middle] < alvo, o alvo so pode estar a ______ do middle, entao ______ = ______.
 *   6. Se v[middle] > alvo, o alvo so pode estar a ______ do middle, entao ______ = ______.
 *   7. Se o laco terminar sem achar: ______________________.
 *
 * PREVISAO (antes de rodar), para o alvo 10:
 *   voltas: ____   retorno: ____
 *
 * DEPOIS DE RODAR: bateu? ____
 */
#include <stdio.h>

int buscaBinaria(int v[], int n, int alvo) {
    /* escreva aqui, com este printf dentro do laco (uma linha por volta):
       printf("volta %d: start=%d end=%d middle=%d v[middle]=%d\n", ...); */
}

int main() {
    int v[] = {2, 5, 9, 14, 20, 33, 41, 58};
    int alvos[] = {2, 14, 41, 58, 10, 1, 70};

    for (int k = 0; k < 7; k++) {
        int pos = buscaBinaria(v, 8, alvos[k]);
        printf("alvo %d: ", alvos[k]);
        /* escreva aqui o if: "achei na posicao %d\n" ou "nao achei\n" */

    }
    return 0;
}
