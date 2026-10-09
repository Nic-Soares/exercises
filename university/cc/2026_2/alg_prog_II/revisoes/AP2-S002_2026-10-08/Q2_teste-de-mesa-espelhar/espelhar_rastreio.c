/* CONFERENCIA: so rode depois de preencher teste_de_mesa.md. */
#include <stdio.h>
void mostrar(int v[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", v[i]);
    }
    printf("\n");
}
void espelhar(int v[], int n) {
    for (int i = 0; i < n / 2; i++) {
        int t = v[i];
        v[i] = v[n - 1 - i];
        v[n - 1 - i] = t;
        printf("   [rastreio] i=%d t=%d n-1-i=%d vetor: %d %d %d %d %d\n", i, t, n - 1 - i, v[0], v[1], v[2], v[3], v[4]);
    }
}
int main() {
    int v[] = {37, 82, 14, 5, 60};
    espelhar(v, 5);
    mostrar(v, 5);
    return 0;
}
