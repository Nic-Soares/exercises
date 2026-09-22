/*
Uma imobiliária vende apenas terrenos retangulares. Faça um programa em C
que leia as dimensões de um terreno e exiba a área do terreno.
*/

#include <stdio.h>
int main () {
  double length, width, area;

  printf("Enter length and width (length x width): ");
  scanf("%lf x %lf", &length, &width);

  area = length * width;
  
  printf("%.2f", area);
}