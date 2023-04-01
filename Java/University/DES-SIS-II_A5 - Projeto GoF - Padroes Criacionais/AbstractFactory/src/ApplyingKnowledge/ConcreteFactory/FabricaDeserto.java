package ApplyingKnowledge.ConcreteFactory;

import PratictingV2.AbstractFactory.FabricaCenario;
import PratictingV2.AbstractProduct.AnimalPerigoso;
import PratictingV2.AbstractProduct.AnimalTransporte;
import PratictingV2.Product.Dromedário;
import PratictingV2.Product.Serpente;

public class FabricaDeserto extends FabricaCenario {

  public AnimalPerigoso createAnimalPerigoso() {
    return new Serpente();
  }

  public AnimalTransporte createAnimalTransporte() {
    return new Dromedário();
  }
}
