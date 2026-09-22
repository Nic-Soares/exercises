/*
(teoria 2, Ex1)
Escreva uma função que converte a temperatura de graus Fahrenheit para
graus Celsius.
*/

#include <stdio.h>

double convertCelsius(double f) {
  return (f - 32) * 5 / 9;
}

int main () {
  double celsius, fahrenheit;

  printf("Ente fahrenheit: \n");
  scanf("%lf", &fahrenheit);

  printf("The temperature in Celsius is: %lf", convertCelsius(fahrenheit));
}