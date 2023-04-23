package AbstractFactory;


import AbstractProduct.*;

public abstract class FabricaCenario {
  public abstract AnimalPerigoso createAnimalPerigoso();
  public abstract AnimalTransporte createAnimalTransporte();
}
