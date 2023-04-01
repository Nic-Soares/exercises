package ApplyingKnowledge.Client;

import PratictingV2.AbstractFactory.FabricaCenario;
import PratictingV2.AbstractProduct.AnimalPerigoso;
import PratictingV2.AbstractProduct.AnimalTransporte;

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
