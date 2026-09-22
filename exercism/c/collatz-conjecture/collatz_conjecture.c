#include "collatz_conjecture.h"

int steps(int start){
  if (start <= 0) {
    return -1;
  }
  
  int step = 0;
  for (; start != 1; step++) {
    if (start % 2 == 0) {
      start = start / 2;
    } else {
      start = start * 3 + 1;
    }
  }

  return step;
}