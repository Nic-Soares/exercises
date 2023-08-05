package CenariosAnimaisVegetacao.AbstractFactory;


import CenariosAnimaisVegetacao.AbstractProduct.*;

public abstract class FabricaCenario {
  public abstract AnimalPerigoso createAnimalPerigoso();
  public abstract AnimalTransporte createAnimalTransporte();
}
