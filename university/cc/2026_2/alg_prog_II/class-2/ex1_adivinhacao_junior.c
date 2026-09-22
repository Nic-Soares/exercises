/*
(teoria 1c, Exercício Júnior)
Desenvolva um programa que:
- Sorteie um número inteiro no intervalo de 1 a 100 (incluindo os
  valores 1 e 100).
- Solicite que o usuário tente adivinhar o número sorteado, digitando o
  seu palpite (se o usuário entrar um valor inválido - menor que 1 ou
  maior que 100 - o programa deverá refazer a solicitação até que o
  usuário entre um valor válido).
- Verifique se o palpite do usuário está correto:
  - Se estiver correto: "Parabéns!!! Você acertou!"
  - Se o palpite for menor que o número sorteado: "Você chutou muito
    baixo! O valor correto é xx." (xx é o número sorteado)
  - Se o palpite for maior que o número sorteado: "Você chutou muito
    alto! O valor correto é xx."
*/

#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int drawNumber () {
  int min = 1, max = 100;
  return min + rand() % (max - min + 1);
}

void verifyChosenNumber(int chosenNumber, int luckyNumber) {
  if (chosenNumber == luckyNumber) {
    printf("Parabéns!!! Você acertou!");
  } else if (chosenNumber < luckyNumber) {
    printf("Você chutou muito baixo! O valor correto é %d.", luckyNumber);
  } else {
    printf("Você chutou muito alto! O valor correto é %d.", luckyNumber);
  }
}

int main () {
  int chosenNumber, luckyNumber, result;
  
  srand(time(NULL));

  do {
    printf("Try to guess a number from 1 to 100: ");
    scanf("%d", &chosenNumber);
  } while (chosenNumber < 1 || chosenNumber > 100);

  verifyChosenNumber(chosenNumber, luckyNumber = drawNumber());
  
  return 0;
}