#include <stdio.h>
int inverte(int x) {
    int r = 0;
    while (x > 0) {
        int d = x % 10;
        r = r * 10 + d;
        x = x / 10;
        printf("x = %d\n", x);
    }
    return r;
}

int main() {
    int a;
    a = inverte(3782);
    printf("main: a = %d\n", a);
    return 0;
}
