#include <stdio.h>

int main() {
    int hour;
    int minute;
    int total_minutes;

    printf("Enter the hour: ");
    scanf("%d", &hour);
    printf("Enter the minute: ");
    scanf("%d", &minute);

    total_minutes = hour * 60 + minute;

    printf("Minutes since the start of the day: %d\n", total_minutes);

    return 0;
}
