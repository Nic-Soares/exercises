#include <stdio.h>

int main() {
    int number;

    printf("Enter an integer number: ");
    scanf("%d", &number);

    if (number % 5 == 0) {
        printf("%d is a multiple of 5\n", number);
    } else {
        printf("%d is not a multiple of 5\n", number);
    }

    return 0;
}
