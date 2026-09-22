/*
(teoria 2, Ex3)
Escreva um programa que solicita hora e minuto ao usuário. Crie uma
função minuto() que recebe hora e minuto e calcula a diferença entre
dois tempos. Por exemplo a diferença entre 2:30 e 1:40 = 50 min.
DICA: scanf("%d:%d", &hr, &min); -> usuário digita ":" entre dois
números.
*/

#include <stdio.h>
#include <stdlib.h>

int minuto(int hr1, int hr, int min, int min1) {
  int totalTime, totalTime1, totalMinutes;

  totalTime = (hr * 60) + min;
  totalTime1 = (hr1 * 60) + min1;

  totalMinutes = abs(totalTime - totalTime1);
  
  return totalMinutes;
}

int main () {
  int min, hr, min1, hr1;

  printf("Enter a first time (00:00, only hours and minutes)");
  scanf("%d:%d", &hr, &min);

  printf("Enter a second (00:00, only hours and minutes)");
  scanf("%d:%d", &hr1, &min1);

  printf("The differente em minutes: %d", minuto(hr1, hr, min, min1));
  
  return 0;
}