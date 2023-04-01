package ApplyingKnowledge.ConcreteFactory;

import ApplyingKnowledge.AbstractFactory.FabricaCenario;
import ApplyingKnowledge.AbstractProduct.AnimalPerigoso;
import ApplyingKnowledge.AbstractProduct.AnimalTransporte;
import ApplyingKnowledge.Product.Dromedário;
import ApplyingKnowledge.Product.Serpente;

public class FabricaDeserto extends FabricaCenario {

  public AnimalPerigoso createAnimalPerigoso() {
    return new Serpente();
  }

  public AnimalTransporte createAnimalTransporte() {
    return new Dromedário();
  }
}
