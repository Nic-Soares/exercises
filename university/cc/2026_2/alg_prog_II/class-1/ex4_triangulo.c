/*
(teoria 1b, Exercício B)
Um triângulo possui 3 lados com tamanhos a, b e c. Para que um triângulo
exista, um lado deve ser menor que a soma dos outros dois, ou seja, as
seguintes condições devem ser satisfeitas: a<b+c, b<a+c, c<a+b.
Desenvolva um programa que:
- Solicite que o usuário digite os tamanhos dos lados do triângulo (a, b
  e c).
- Verifique se existe um triângulo com estes lados.
- Apresente na tela o resultado.
*/


#include <stdio.h>

int main() 
{
  double side_a, side_b, side_c;

  printf("Enter the first side: \n");
  scanf("%lf", &side_a);
  
  printf("Enter the second side: \n");
  scanf("%lf", &side_b);
  
  printf("Enter the third side: \n");
  scanf("%lf", &side_c);

  if (side_a < side_b + side_c && side_b < side_a + side_c && side_c < side_a + side_b) {
    printf("It is a triangle");
  } else {
    printf("It is not a triangle");
  }

  
}