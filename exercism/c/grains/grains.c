#include "grains.h"
#include <stdint.h>

uint64_t square(uint8_t index) {
  if(index <= 0 || index > 64) {
    return 0;
  }
  
  uint64_t grains = 1;

  for (uint64_t i = 1; i < index; i++) {
    grains = grains * 2;
  }
  return  grains;
}

uint64_t total(void) {
  uint64_t calc = 0;
  
  for (uint64_t i = 0; i < 65; i++) {
    calc += square(i);
  }

  return calc;
}