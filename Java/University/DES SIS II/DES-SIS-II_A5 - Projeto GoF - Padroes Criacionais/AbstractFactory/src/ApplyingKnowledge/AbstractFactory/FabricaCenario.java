package ApplyingKnowledge.AbstractFactory;

import ApplyingKnowledge.AbstractProduct.AnimalPerigoso;
import ApplyingKnowledge.AbstractProduct.AnimalTransporte;

public abstract class FabricaCenario {
  public abstract AnimalPerigoso createAnimalPerigoso();
  public abstract AnimalTransporte createAnimalTransporte();
}
