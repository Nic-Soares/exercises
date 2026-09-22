/*
(teoria 1a, Exercício 1)
Escreva um programa que peça para o usuário fornecer a temperatura em
graus Celsius, e a seguir calcule e imprima na tela a temperatura
correspondente em Fahrenheit.
*/

#include <stdio.h>

int main() {
  double temperatureCelsius, temperatureFahrenheit;

  printf("Enter the temperature in Celsius: \n");
  scanf("%lf", &temperatureCelsius);

  temperatureFahrenheit = temperatureCelsius * 9 / 5 + 32;

  printf("This temperature in Fahrarenheit is: \n");
  printf("%.2f", temperatureFahrenheit);
}