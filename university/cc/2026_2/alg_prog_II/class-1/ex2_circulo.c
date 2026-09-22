/*
(teoria 1a, Exercício 2)
Escreva um programa que peça para o usuário fornecer o valor do raio de
um círculo, e a seguir calcule e imprima na tela a área e o perímetro
deste círculo.
Observação: Assuma que o valor de PI é 3.1415926.
*/

#include <stdio.h>

int main() 
{
  double input_number, area, perimeter, pi;
  pi = 3.1415926;

  printf("Enter the radius value: ");
  scanf("%lf", &input_number);

  area = pi * (input_number * input_number);
  perimeter = 2 * pi * input_number;

  printf("Area is: %.2f \n", area);
  printf("Perimeter is: %.2f", perimeter);
}