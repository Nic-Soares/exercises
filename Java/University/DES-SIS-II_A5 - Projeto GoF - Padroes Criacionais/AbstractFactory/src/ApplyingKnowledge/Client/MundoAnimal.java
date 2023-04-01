package ApplyingKnowledge.Client;

import ApplyingKnowledge.AbstractFactory.FabricaCenario;
import ApplyingKnowledge.AbstractProduct.AnimalPerigoso;
import ApplyingKnowledge.AbstractProduct.AnimalTransporte;

public class MundoAnimal {
  private final AnimalPerigoso animalPerigoso;
  private final AnimalTransporte animalTransporte;

  public MundoAnimal (FabricaCenario Fabrica){
    animalPerigoso = Fabrica.createAnimalPerigoso();
    animalTransporte = Fabrica.createAnimalTransporte();
  }

  public void runAnimalFeatures(){
    animalTransporte.transporting();
    animalPerigoso.attack();
  }
}
