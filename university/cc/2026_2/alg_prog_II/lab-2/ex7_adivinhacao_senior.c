#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int drawNumber() {
  int min = 1, max = 100;
  return min + rand() % (max - min + 1);
}

void verifyNumber(int luckyNumber) {
    int chosenNumber;
    int tentativas = 0;

    do {
        do {
            printf("Tentativa %d. Escolha seu número (1 a 100): \n", tentativas + 1);
            scanf("%d", &chosenNumber);
        } while (chosenNumber < 1 || chosenNumber > 100);

        tentativas++;

        if (chosenNumber < luckyNumber) {
            printf("Você chutou muito baixo!\n\n");
        } else if (chosenNumber > luckyNumber) {
            printf("Você chutou muito alto!\n\n");
        }
    } while (chosenNumber != luckyNumber && tentativas < 5);

    if (chosenNumber == luckyNumber) {
        printf("Parabéns!!! Você acertou o número %d em %d tentativas!\n", luckyNumber, tentativas);
    } else {
        printf("Você excedeu o número máximo de tentativas! O número sorteado era %d.\n", luckyNumber);
    }
}

int main() {
    srand(time(NULL));
    int luckyNumber = drawNumber();
    verifyNumber(luckyNumber);
    return 0;
}