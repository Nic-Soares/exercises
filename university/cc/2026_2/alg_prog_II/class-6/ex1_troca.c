/*
 * Ponteiros (teoria 6) - exemplo canonico "troca"
 *
 * Enunciado (slide "Ponteiros - passagem de parametros"):
 * Escreva uma funcao que troque os valores de duas variaveis inteiras,
 * usando ponteiros (passagem por referencia), e um main que a use.
 *
 * Assinatura esperada: void troca(int *p, int *q)
 *
 * Antes de compilar: rastreie no papel o que esta em p, q e temp,
 * linha a linha, para dois valores de teste (ex.: a = 6, b = 9).
 */

#include <stdio.h>

void troca(int *p, int *q)
{
  int temp = *p;
  *p = *q;
  *q = temp;
}

int main(void)
{
  int x = 6, y = 7;

  printf("A variavel 'x' é %d, e a variavel 'y' é %d: \n", x, y);
  troca(&x, &y);
  printf("Agora a variavel 'x' é %d, e a variavel 'y' é %d: \n", x, y);
  return 0;
}
