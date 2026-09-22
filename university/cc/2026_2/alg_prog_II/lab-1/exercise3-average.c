/*
Crie um programa em C que leia três notas e mostre a média entre elas.
*/

#include <stdio.h>

int main () 
{
  int first, second, third;
  
  printf("Enter a first number: ");
  scanf("%d", &first);

  printf("Enter a second number: ");
  scanf("%d", &second);

  printf("Enter a third number: ");
  scanf("%d", &third);

  double calc = (double)(first + second + third) / 3;

  printf("%.2f", calc);
  
  return 0;
}