#include "difference_of_squares.h"
#include <stdio.h>

unsigned int square_of_sum(unsigned int number) {
  unsigned int sum = 0;
  for (unsigned int i = 1; i <= number; i++){
    sum += i;
  }
  return sum * sum;
}

unsigned int sum_of_squares(unsigned int number) {
  unsigned int sum = 0;
  for (unsigned int i = 1; i <= number; i++) {
    sum += i * i;
  }
  return sum;
}

unsigned int difference_of_squares(unsigned int number) {
  unsigned int first_number = square_of_sum(number);
  unsigned int second_number = sum_of_squares(number);

  unsigned int calc = first_number - second_number;

  return calc;
}
