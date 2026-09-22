  /*
  (teoria 1c, Exercício Sênior)
  Desenvolva um programa semelhante ao Exercício Pleno, só que com a
  seguinte diferença:
  - Caso o usuário não consiga acertar o número sorteado após a 5ª
    tentativa, o programa deverá mostrar a mensagem "você excedeu o
    número máximo de tentativas" e mostrar qual era o número sorteado.
  */
  
  #include <stdio.h>
  #include <stdlib.h>
  #include <time.h>
  
  int drawNumber () {
    int min = 1, max = 100;
    return min + rand() % (max - min + 1);
  }
  
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
  
  void playGame(int luckyNumber) {
    int chosenNumber, count;
    
    for (count = 5; count > 0; count--) {
      chosenNumber = getValidGuess();
      if (chosenNumber == luckyNumber) {
        printf("Parabéns!!! Você acertou em %d tentativa(s)!\n", 6 - count);
        return;
      } else if (chosenNumber < luckyNumber) {
        printf("Você chutou muito baixo! Lhe restam %d tentativas\n", count - 1);        
      } else {
        printf("Você chutou muito alto! Lhe restam %d tentativas\n", count - 1);
      }
    }
    printf("Você excedeu o número máximo de tentativas. O número era: %d", luckyNumber);
  }
  
  int main () {
    srand(time(NULL));
    int luckyNumber = drawNumber();
  
    printf("--- JOGO DA ADIVINHAÇÃO ---\n");
    playGame(luckyNumber);
    
    return 0;
  }