#include <stdio.h>

int main() {
    double width;
    double length;
    double area;

    printf("Enter the land width: ");
    scanf("%lf", &width);
    printf("Enter the land length: ");
    scanf("%lf", &length);

    area = width * length;

    printf("Land area: %.2f\n", area);

    return 0;
}
