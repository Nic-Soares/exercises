/*
Extra 2. Faça uma função que recebe um valor inteiro e verifica se o valor é par ou ímpar. A função deve retornar um valor booleano
 */


#include <stdio.h>

int main () {
  int number, calc;

  printf("Enter the number to determine if it is even or odd:");
  scanf("%d", &number);

  if (number % 2 == 0) {
    printf("It's even.");
  } else {
    printf("It's odd.");
  }
  
  return 0;
}