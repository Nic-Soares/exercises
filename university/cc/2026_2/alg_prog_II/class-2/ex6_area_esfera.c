/*
(teoria 2, Ex2)
Escreva uma função que calcula a área de uma esfera e retorna o valor
em ponto flutuante. Solicite ao usuário que forneça o raio. A constante
Pi deve estar declarada.
*/

#include <stdio.h>
#include <math.h>
#define PI 3.14159265

float calculatesAreaSphere (float radio) {
  return 4 *  PI * pow(radio, 2);
}

int main () { 
  float radius;

  printf("Enter the radius to calculate the area of ​​the circle: \n"); 
  scanf("%f", &radius);

  printf("The area is: %.2f", calculatesAreaSphere(radius));
  
  return 0;
}