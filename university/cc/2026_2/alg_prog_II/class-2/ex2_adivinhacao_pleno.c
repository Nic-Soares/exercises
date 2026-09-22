/*
(teoria 1c, Exercício Pleno)
Desenvolva um programa semelhante ao Exercício Júnior, só que com as
seguintes diferenças:
- Se o palpite do usuário estiver incorreto, o programa deverá imprimir
  a dica ("você chutou muito baixo" ou "você chutou muito alto") sem
  mostrar o valor sorteado, incrementar o número de tentativas e dar
  uma nova chance até que ele consiga acertar o número sorteado.
- Quando o usuário conseguir acertar o número sorteado, o programa
  deverá apresentar a mensagem de parabéns e mostrar o número de
  tentativas feitas pelo usuário até acertar o número.
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// 1. Responsabilidade única: Sorteia o número
int drawNumber() {
  int min = 1, max = 100;
  return min + rand() % (max - min + 1);
}

// 2. Responsabilidade única: Lê e valida a entrada (Evita repetição de código)
int getValidGuess() {
  int guess;
  do {
    printf("Digite seu palpite (entre 1 e 100): ");
    scanf("%d", &guess);
    
    if (guess < 1 || guess > 100) {
      printf("Valor inválido! Tente novamente.\n");
    }
  } while (guess < 1 || guess > 100);
  
  return guess;
}

// 3. Responsabilidade única: Controla o fluxo do jogo
void playGame(int luckyNumber) {
  int chosenNumber;
  int count = 0;
  
  do {
    chosenNumber = getValidGuess();
    count++; // Conta cada tentativa validada
    
    if (chosenNumber < luckyNumber) {
      printf("Você chutou muito baixo!\n");
    } else if (chosenNumber > luckyNumber) {
      printf("Você chutou muito alto!\n");
    }
    
  } while (chosenNumber != luckyNumber);
  
  printf("Parabéns!!! Você acertou em %d tentativa(s)!\n", count);
}

int main() {
  // Inicializa a semente aleatória apenas uma vez
  srand(time(NULL));

  printf("--- JOGO DA ADIVINHAÇÃO ---\n");
  
  int luckyNumber = drawNumber();
  playGame(luckyNumber);
  
  return 0;
}