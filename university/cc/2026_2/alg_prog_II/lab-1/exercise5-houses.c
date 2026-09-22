/*
Elon Musk acaba de liberar dez milhões de dólares para Construtora Fonseca
e Mercadante construir casas populares no Brasil. Cada casa custa o
equivalente a 150 salários mínimos. Crie um programa em C que leia o valor
do salário mínimo, o valor do dólar do dia e calcule a quantidade de casas
possíveis de construir.
*/

#include <stdio.h>
int main() {
  double dolar_value_in_real, elon_donation, min_salary, elon_donation_in_real, only_house_value, qty_houses;

  min_salary = 1665.5;
  only_house_value = min_salary * 150;
  elon_donation = 10000000.0;

  printf("Enter dolar value today: ");
  scanf("%lf", &dolar_value_in_real);
  
  elon_donation_in_real = dolar_value_in_real * elon_donation;
  qty_houses = elon_donation_in_real / only_house_value;

  printf("Number of houses that can be built: %lf", qty_houses);
  
}