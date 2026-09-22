/*
Crie um programa em C que leia o valor do salário mínimo e o valor do
salário bruto de uma pessoa. Calcular e imprimir quantos salários mínimos
ela ganha.
*/

#include <stdio.h>

int main () {
  
  double salary;
  double min_salary;
  
  printf("How much is your salary? ");
  scanf("%lf", &salary);

  printf("Enter the current minimum wage: ");
  scanf("%lf", &min_salary);
  
  printf("%.2f", salary / min_salary);
  
  return 0;
}