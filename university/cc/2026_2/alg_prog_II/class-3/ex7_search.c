/*
Escreva uma função que recebe um vetor contendo 5 números inteiros e um
valor x. A função deverá devolver um inteiro contendo a posição em que o
valor x (lido do teclado) está no vetor. Caso o valor x não seja encontrado,
a função deve retornar o valor -1.
OBS: considere que o vetor não tem números repetidos.
*/


#include <stdio.h>

int searchValue (int v[], int x) {
  for (int i = 0; i < 5; i++) {
    if (v[i] == x) {
      return i;
    }
  }

  return -1;
}

int main () {
  int v[5], x; 

  for (int i = 0; i < 5; i++) {
    printf("Enter a number (%d left): \n", 5 - i);
    scanf("%d", &v[i]);
  }

  printf("Enter the number you want to search for: \n");
  scanf("%d", &x);

  searchValue(v, x);
  
  return 0;
}