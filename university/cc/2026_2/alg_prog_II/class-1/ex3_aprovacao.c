/*
(teoria 1b, Exercício A)
Escreva um programa que peça para o aluno entrar a sua média (de 0.0 a
10.0) e a sua porcentagem de frequência (de 0 a 100%).
O programa deverá apresentar o resultado do aluno de acordo com as
seguintes regras:
- Se a frequência foi menor que 75%, o aluno está REPROVADO, não importa
  a nota que ele tirou.
- Se a frequência foi maior ou igual a 75% e a sua média foi maior ou
  igual a 7.5, ele está APROVADO.
- Se a frequência foi maior ou igual a 75% mas a sua média foi menor que
  7.5, ele está DE EXAME.
*/

#include <stdio.h>

int main () {
  double average, frequency;

  printf("Enter your frequency: \n");
  scanf("%lf", &frequency);

  printf("Enter your average: \n");
  scanf("%lf", &average);

  if (frequency < 75) {
    printf("REPROVADO");
  } else if (frequency >=75 && average >= 7.5) {
      printf("APROVADO");
  } else {
      printf("DE EXAME");
  }
  
}