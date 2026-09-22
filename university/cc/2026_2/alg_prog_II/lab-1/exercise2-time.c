/*
Crie um programa em C que leia um valor de hora e informe quantos minutos
se passaram desde o início do dia.
*/

#include <stdio.h>

int main () 
{
  int hour;
  int minutes;
  
  printf("What time is it? ");
  scanf("%d:%d", &hour, &minutes);

  int total_minutes = (hour * 60) + minutes;

  printf("%d", total_minutes);
  
  return 0;
}