package Client;

import AbstractComponent.*;
import AbstractDecorator.VegetacaoDecorator;
import AbstractFactory.FabricaCenario;
import AbstractProduct.*;

public class MundoAnimal {
  private final AnimalPerigoso animalPerigoso;
  private final AnimalTransporte animalTransporte;
  private Cenario cenario;

  public MundoAnimal(FabricaCenario fabrica, Cenario cenario) {
    animalPerigoso = fabrica.createAnimalPerigoso();
    animalTransporte = fabrica.createAnimalTransporte();
    this.cenario = cenario;
  }

  public void runAnimalFeatures() {
    cenario.descrição();
    animalTransporte.transporting();
    animalPerigoso.attack();
  }

  public void setVegetacaoDecorator(VegetacaoDecorator decorator) {
    decorator.cenario = cenario;
    cenario = decorator;
  }
}

