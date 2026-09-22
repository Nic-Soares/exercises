/*
    Um triângulo possui 3 lados com tamanhos a, b e c.
    Para que um triângulo exista, um lado deve ser menor que a soma dos outros dois, ou seja, as
    seguintes condições devem ser satisfeitas:
    • a < b + c
    • b < a + c
    • c < a + b
    Desenvolva um programa que:
    • Solicite que o usuário digite os tamanhos dos lados do triângulo (a, b e c).
    • Verifique se existe um triângulo com estes lados.
    • Apresente na tela o resultado.
    Escreva uma função para verificar se o triângulo existe e outra para apresentar o resultado.
 */

#include <stdio.h>

void printResulte (int result) {
  if (result) {
    printf("Is a triangle!");
  } else {
    printf("Is not a triangle!");
  }
}

int validateTriangle (int a, int b, int c) {
  if (a < b +c && b < a + c && c < a + b) {
    return 1;
  } else {
    return 0;
  }
}

int main ( ){
  int sides[3];
  char sidesNames[] = {'x', 'y', 'z'};
  
  for (int i = 0; i < 3; i++) {
      printf("Enter the number for the %dº side (%c): \n", i + 1, sidesNames[i]);
      scanf("%d", &sides[i]);
  }

  int result = validateTriangle(sides[0], sides[1], sides[2]);
  printResulte(result);
  
  return 0;
}