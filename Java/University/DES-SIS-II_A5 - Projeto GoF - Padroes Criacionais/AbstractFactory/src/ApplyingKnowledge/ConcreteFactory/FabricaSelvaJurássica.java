package ApplyingKnowledge.ConcreteFactory;

import PratictingV2.AbstractFactory.FabricaCenario;
import PratictingV2.AbstractProduct.AnimalPerigoso;
import PratictingV2.AbstractProduct.AnimalTransporte;
import PratictingV2.Product.Dromedário;
import PratictingV2.Product.Pterodátilo;
import PratictingV2.Product.Serpente;
import PratictingV2.Product.TRex;

public class FabricaSelvaJurássica extends FabricaCenario {

  public AnimalPerigoso createAnimalPerigoso() {
    return new TRex();
  }

  public AnimalTransporte createAnimalTransporte() {
    return new Pterodátilo();
  }
}
