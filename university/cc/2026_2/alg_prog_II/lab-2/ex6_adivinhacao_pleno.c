/*
    Desenvolva um programa semelhante ao anterior, só que com as seguintes
    diferenças:
    • Se o palpite do usuário estiver incorreto, o programa deverá imprimir a dica
    (“você chutou muito baixo” ou “você chutou muito alto”) sem mostrar o
    valor sorteado, incrementar o número de tentativas e dar uma nova chance
    até que ele consiga acertar o número sorteado.
    • Quando o usuário conseguir acertar o número sorteado, o programa deverá
    apresentar a mensagem de parabéns e mostrar o número de tentativas feitas
    pelo usuário até acertar o número.
    Crie funções para modularizar o seu programa.
 */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int drawNumber() {
    int min = 1, max = 100;
    return min + rand() % (max - min + 1);
}

void verifyNumber(int luckyNumber) {
    int chosenNumber = 0;
    int tentative = 0;

    // Loop infinito que só é interrompido quando o usuário acerta
    while (1) {
        tentative += 1;
        
        // Pede o palpite e garante que a entrada seja de 1 a 100
        do {
            printf("Tentativa %d. Escolha seu número (1 a 100): \n", tentative);
            scanf("%d", &chosenNumber);
            
            if (chosenNumber < 1 || chosenNumber > 100) {
                printf("Entrada invalida. Por favor, digite um numero entre 1 e 100.\n\n");
            }
        } while (chosenNumber < 1 || chosenNumber > 100);

        // Avalia o palpite válido imediatamente
        if (chosenNumber == luckyNumber) {
            printf("Parabéns!!! Você acertou o número %d em %d tentativas!\n", luckyNumber, tentative);
            break; // Sai do laço e encerra a função
        } 
        
        if (chosenNumber < luckyNumber) {
            printf("Você chutou muito baixo!\n\n");
        } else {
            printf("Você chutou muito alto!\n\n");
        }
    }
}

int main() {
    // A inicialização da semente deve ser chamada apenas uma vez
    srand(time(NULL));
    
    int luckyNumber = drawNumber();
    verifyNumber(luckyNumber);
    
    return 0;
}