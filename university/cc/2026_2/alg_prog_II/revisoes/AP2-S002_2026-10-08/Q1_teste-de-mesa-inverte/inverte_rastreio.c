/* CONFERENCIA: so rode depois de preencher teste_de_mesa.md.
   Mesmo codigo do inverte.c, com uma linha [rastreio] por volta. */
#include <stdio.h>
int inverte(int x) {
    int r = 0;
    int volta = 1;
    while (x > 0) {
        int d = x % 10;
        r = r * 10 + d;
        x = x / 10;
        printf("x = %d\n", x);
        printf("   [rastreio] volta %d: d=%d r=%d x=%d\n", volta, d, r, x);
        volta++;
    }
    return r;
}

int main() {
    int a;
    a = inverte(3782);
    printf("main: a = %d\n", a);
    return 0;
}
