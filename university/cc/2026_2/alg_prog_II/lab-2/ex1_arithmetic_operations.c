/*
    Escreva um programa em C que solicite que o usuário forneça dois números
    inteiros e imprima o resultado da soma, subtração, multiplicação e divisão
    inteira desses números.
*/

#include <stdio.h>

int main () {
  int x, y, sum, sub, mult, div;

  printf("Enter the first number: \n");
  scanf("%d", &x);

  printf("Enter the second number: \n");
  scanf("%d", &y);

  sum = x + y;
  sub = x - y;
  mult = x * y;

  if (y == 0) {
    div = 0;
  } else {
    div = x / y; 
  }
  
  printf("Sum: %d + %d = %d \n", x, y, sum);
  printf("Subtration: %d - %d = %d \n", x, y, sub);
  printf("Multiplication: %d x %d = %d \n", x, y, mult);
  printf("Division: %d / %d = %d \n", x, y, div);  

  return 0;
}