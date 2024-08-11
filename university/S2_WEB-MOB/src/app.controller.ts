import { Controller, Get, Param } from '@nestjs/common';
import { AppService } from './app.service';

@Controller()
export class AppController {
  constructor(private readonly appService: AppService) {}

  @Get(':peso' + '/' + ':altura')
  calculaIMC(@Param('peso') peso, @Param('altura') altura): number {
    return this.appService.calculaIMC(peso, altura);
  }
}
