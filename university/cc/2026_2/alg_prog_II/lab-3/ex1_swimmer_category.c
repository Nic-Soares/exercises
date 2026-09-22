/*
    ## Extra 1
    
    Faça uma função que recebe a idade de um nadador por parâmetro e retorna, também por parâmetro, a categoria desse nadador de acordo com a tabela abaixo.
    
    Desenvolva um programa e crie uma função para cada funcionalidade:
    
    - Solicite que o usuário digite a idade.
    - Classifique o nadador.
    - Apresente na tela o resultado.
    
    ### Categorias
    
    | Idade | Categoria |
    |---|---|
    | 5 a 7 anos | Infantil A |
    | 8 a 10 anos | Infantil B |
    | 11 a 13 anos | Juvenil A |
    | 14 a 17 anos | Juvenil B |
    | 18 anos ou mais | Adulto |
 */

#include <stdio.h>

void classifiesSwimmer (int year) {
  if (year >= 5 || year <= 7) {
    printf("Infantil A");
  } else if (year >= 8 || year <= 10) {
    printf("Infantil B");
  } else if (year >= 11 || year <= 13) {
    printf("Juvenil A");
  } else if (year >= 14 || year <= 17) {
    printf("Juvenil B");
  } else {
    printf("Adulto");
  }
}

int main () {
  int year = 0;

  classifiesSwimmer(year);
  
  return 0;
}