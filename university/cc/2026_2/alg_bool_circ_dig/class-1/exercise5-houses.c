#include <stdio.h>

int main() {
    double minimum_wage;
    double dollar_today;
    double donation_dollars = 10000000.0;
    double donation_local_currency;
    double total_minimum_wages;
    double houses_built;

    printf("Enter the minimum wage: ");
    scanf("%lf", &minimum_wage);
    printf("Enter today's dollar rate: ");
    scanf("%lf", &dollar_today);

    donation_local_currency = donation_dollars * dollar_today;
    total_minimum_wages = donation_local_currency / minimum_wage;
    houses_built = total_minimum_wages / 150.0;

    printf("Number of houses that can be built: %.2f\n", houses_built);

    return 0;
}
