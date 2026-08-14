#include <stdio.h>

int main() {
    double grade1;
    double grade2;
    double grade3;
    double average;

    printf("Enter grade 1: ");
    scanf("%lf", &grade1);
    printf("Enter grade 2: ");
    scanf("%lf", &grade2);
    printf("Enter grade 3: ");
    scanf("%lf", &grade3);

    average = (grade1 + grade2 + grade3) / 3.0;

    printf("Average: %.2f\n", average);

    return 0;
}
