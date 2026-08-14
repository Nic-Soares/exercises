#include <stdio.h>
int main() {
    double minimum_wage;
    double gross_salary;
    double result;

    printf("Enter the minimum wage: ");
    scanf("%lf", &minimum_wage);
    printf("Enter the gross salary: ");
    scanf("%lf", &gross_salary);

    result = gross_salary / minimum_wage;

    printf("Number of minimum wages earned: %.2f\n", result);

    return 0;
}
