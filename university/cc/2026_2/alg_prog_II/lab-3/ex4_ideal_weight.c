/*
Extra 4. Faça uma função que recebe, por parâmetro, a altura (alt) e o sexo de uma pessoa e retorna o seu peso ideal. Para homens, calcular o peso ideal usando a fórmula peso ideal = 72.7 x alt - 58 e, para mulheres, peso ideal = 62.1 x alt - 44.7.
 */

#include <stdio.h>

double idealWeight(double height, char sex) {
  double calc;

  if (sex == 'M') {
    calc = 72.7 * height - 58;
  } else {
    calc = 62.1 * height - 44.7;
  }
  
  return calc;
}

int main () {
  double height;
  char sex;

  do {
    printf("Enter your gender to get your ideal weight. (Only \"M\" for men and \"W\" for women).");
    scanf(" %c", &sex);
  } while (sex != 'M' && sex != 'W');

  printf("Enter your height to get your ideal weight.");
  scanf("%lf", &height);
  
  printf("Your ideal weight is: %lf", idealWeight(height, sex));
  
  return 0;
}