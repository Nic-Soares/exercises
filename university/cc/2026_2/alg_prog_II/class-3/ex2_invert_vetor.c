/*
Escreva uma função que recebe um vetor de TAM 5 e inverte seus valores. Para o vetor abaixo:
V = [4, 9, 10, 8, 6]
o vetor V invertido é igual a [6, 8, 10, 9, 4]
*/

#include <stdio.h>
#define TAM 5

void invertVetor (int v[TAM]) {
  int temp;
  for (int i = 0; i < TAM / 2; i++) {
    temp = v[i];
    v[i] = v[TAM - 1 -i];
    v[TAM - 1 - i] = temp;
  }
}

int main () {
  int v[TAM] = {4, 9, 10, 8, 6};

  invertVetor(v);
  
  for (int i = 0; i < TAM; i++){
    printf("%d ", v[i]);
  }
}