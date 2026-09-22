/*
    Desenvolva um programa para calcular o IMC (Índice de Massa Corporal) de uma
    pessoa.
    
    Seu programa deverá:
    • Solicitar o peso da pessoa (em quilogramas).
    • Solicitar a altura da pessoa (em metros).
    • Calcular o IMC pela fórmula: 𝐼𝑀𝐶 = 𝑝𝑒𝑠𝑜 / 𝑎𝑙𝑡𝑢𝑟𝑎2
    • Imprimir o resultado na tela do computador utilizando uma mensagem no
    formato:
    
    O IMC de uma pessoa com peso __ kg e altura __ m é igual a ___.
    Observação: utilize valores de ponto flutuante para todas as grandezas
    envolvidas.
 */

#include <stdio.h>

double calcIMC (double weight, double height) {
  double calc;
  calc = weight / (height * height);
  return calc;
}

int main () {
  double weight, height, imc;

  printf("Enter your weight: \n");
  scanf("%lf", &weight);

  printf("Enter your height: \n");
  scanf("%lf", &height);

  imc = calcIMC(weight, height);
  printf("Your IMC is: %.2lf\n", imc);

  return 0;
}
