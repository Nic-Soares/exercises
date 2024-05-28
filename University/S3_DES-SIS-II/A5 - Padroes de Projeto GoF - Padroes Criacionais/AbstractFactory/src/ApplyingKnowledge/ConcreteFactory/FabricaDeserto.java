package ApplyingKnowledge.ConcreteFactory;

import ApplyingKnowledge.AbstractFactory.FabricaCenario;
import ApplyingKnowledge.AbstractProduct.AnimalPerigoso;
import ApplyingKnowledge.AbstractProduct.AnimalTransporte;
import ApplyingKnowledge.Product.Dromedário;
import ApplyingKnowledge.Product.Serpente;

public class FabricaDeserto extends FabricaCenario {
  private static FabricaDeserto instace = null;

  private FabricaDeserto(){}

  public static  FabricaDeserto getInstance(){
    if (instace == null){
      instace = new FabricaDeserto();
    }
    return instace;
  }

  public AnimalPerigoso createAnimalPerigoso() {
    return new Serpente();
  }

  public AnimalTransporte createAnimalTransporte() {
    return new Dromedário();
  }
}
