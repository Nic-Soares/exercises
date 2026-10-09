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
    }
}
int main() {
    int v[] = {37, 82, 14, 5, 60};
    espelhar(v, 5);
    mostrar(v, 5);
    return 0;
}
