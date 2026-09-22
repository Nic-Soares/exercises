/*
    Desenvolva um programa que:
    • Sorteie um número inteiro no intervalo de 1 a 100 (incluindo os valores 1 e 100).
    • Solicite que o usuário tente adivinhar o número sorteado, digitando o seu palpite.
    (se o usuário entrar um valor inválido - menor que 1 ou maior que 100 - o programa deverá 
    refazer a solicitação até que o usuário entre um valor válido).
    • Verifique se o palpite do usuário está correto:
    • Se estiver correto, o programa deverá imprimir na tela “Parabéns!!! Você acertou!”
    • Se o palpite for menor que o número sorteado, deverá imprimir “Você chutou muito baixo! O
    valor correto é xx.” (onde xx é o número sorteado).
    • Se o palpite for maior que o número sorteado, deverá imprimir “Você chutou muito alto! O valor
    correto é xx.” (onde xx é o número sorteado).
    • Crie funções para modularizar o seu programa.
 */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int drawNumber() {
  int min = 1, max = 100;
  return min + rand() % (max - min + 1);
}

void verifyNumber(int chosenNumber, int luckyNumber) {
  if (chosenNumber == luckyNumber) {
    printf("Parabéns!!! Você acertou!");
  } else if (chosenNumber < luckyNumber) {
    printf("Você chutou muito baixo! O valor correto é %d", luckyNumber);
  } else {
    printf("Você chutou muito alto! O valor correto é %d", luckyNumber);
  }
}

int main () {
  int chosenNumber, luckyNumber;
    srand(time(NULL));
  
  do {
      printf("Choose your number (1 to 100): \n");
      scanf("%d", &chosenNumber);
  } while (chosenNumber < 1 || chosenNumber > 100);

  luckyNumber = drawNumber();
  verifyNumber(chosenNumber, luckyNumber);
  
  return 0;
}