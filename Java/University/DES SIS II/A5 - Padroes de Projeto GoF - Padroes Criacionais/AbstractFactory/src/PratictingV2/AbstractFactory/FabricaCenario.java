package PratictingV2.AbstractFactory;

import PratictingV2.AbstractProduct.AnimalPerigoso;
import PratictingV2.AbstractProduct.AnimalTransporte;

public abstract class FabricaCenario {
  public abstract AnimalPerigoso createAnimalPerigoso();
  public abstract AnimalTransporte createAnimalTransporte();
}
