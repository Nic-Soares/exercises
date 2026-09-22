/*
Escreva um programa em C que receba um valor inteiro e diga se ele é
múltiplo de 5 (pesquise sobre estrutura condicional em C).
*/

#include <stdio.h>

int main () 
{
  int input_number;

  printf("Enter a int number: ");
  scanf("%d", &input_number);

  if (input_number % 5 == 0) {
    printf("This number is multiple for 5") ;
  } else {
    printf("This number is not multiple for 5") ;
  }
}