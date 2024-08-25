import { Injectable } from '@nestjs/common';

@Injectable()
export class AppService {
  calculaIMC(peso: number, altura: number): number {
    return peso / (altura * altura);
  }
}

