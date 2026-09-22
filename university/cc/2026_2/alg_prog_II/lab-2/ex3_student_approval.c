/*
    Escreva um o programa que peça para o aluno entrar a sua média (de 0.0 a 10.0) e a sua porcentagem de
    frequência (de 0 a 100%).
    Escreva função que tenha os parâmetros média e a porcentagem e apresente o resultado na tela.
    O seu programa deverá apresentar o resultado do aluno de acordo com as seguintes regras:
    • Se a frequência foi menor que 75%, o aluno está REPROVADO, não importa a nota que ele tirou.
    • Se a frequência foi maior ou igual a 75% e a sua média foi maior ou igual a 7.5, ele está APROVADO.
    • Se a frequência foi maior ou igual a 75% mas a sua média foi menor que 7.5, ele está DE EXAME.
 */

#include <stdio.h>

void verifyFrequency (double frequency, double average) {
  if (frequency < 75) {
    printf("FAILED");
  } else if (frequency >= 75 && average >= 7.5) {
    printf("APPROVED");
  } else {
    printf("EXAM");
  }
}

int main () {
  double frequency, average;

  printf("Enter your class frequency: \n");
  scanf("%lf", &frequency);

  printf("Enter your average: \n");
  scanf("%lf", &average);

  verifyFrequency(frequency, average);
  
  return 0;
}