/*
 Extra 3. Escreva uma função que recebe por parâmetro um valor inteiro e positivo N e retorna o valor de S. S = 1 + ½ + 1/3 + ¼ + 1/5 + 1/N.
 */

#include <stdio.h>

double harmonicSeries (int number) {
  double harmonicNumber = 1;
  
  for (int i = 2; i <= number; i++) {
    harmonicNumber += 1.0 / i;
  }

  return harmonicNumber;
}

int main () {
  int number;

  printf("Enter a number; this number must be a positive integer greater than 0:");
  scanf("%d", &number);

  printf("The harmonic number is: %lf", harmonicSeries(number));
  
  return 0;
}