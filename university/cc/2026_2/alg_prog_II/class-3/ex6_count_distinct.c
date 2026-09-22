/*
Escreva uma função que preencha por leitura do teclado um vetor de 10 posições e retorna um inteiro com a quantidade de valores diferentes que existem no vetor.
 */


#include <stdio.h>
#define SIZE 10

int countDistinct(int v[]) {
    int count = 0;

    for (int i = 0; i < SIZE; i++) {
        int is_duplicate = 0;
        
        // Verifica se o número atual (v[i]) já apareceu nas posições anteriores (v[j])
        for (int j = 0; j < i; j++) {
            if (v[i] == v[j]) {
                is_duplicate = 1;
                break; // Se achar uma duplicata, pode parar de procurar
            }
        }
        
        // Se não for duplicado, incrementa a contagem de números diferentes
        if (is_duplicate == 0) {
            count++;
        }
    }

    return count;
}

int main() {
    int v[SIZE];
    
    for (int i = 0; i < SIZE; i++) {
        printf("Digite um numero (restam %d): ", SIZE - i);
        scanf("%d", &v[i]);
    }

    // Armazena e exibe o retorno da função
    int total_diferentes = countDistinct(v);
    printf("\nQuantidade de valores diferentes no vetor: %d\n", total_diferentes);
    
    return 0;
}