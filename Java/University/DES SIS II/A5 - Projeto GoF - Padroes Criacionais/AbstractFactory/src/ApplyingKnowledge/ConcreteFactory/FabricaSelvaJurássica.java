package ApplyingKnowledge.ConcreteFactory;

import ApplyingKnowledge.AbstractFactory.FabricaCenario;
import ApplyingKnowledge.AbstractProduct.AnimalPerigoso;
import ApplyingKnowledge.AbstractProduct.AnimalTransporte;
import ApplyingKnowledge.Product.Dromedário;
import ApplyingKnowledge.Product.Pterodátilo;
import ApplyingKnowledge.Product.Serpente;
import ApplyingKnowledge.Product.TRex;

public class FabricaSelvaJurássica extends FabricaCenario {
  private static FabricaSelvaJurássica instace = null;

  private FabricaSelvaJurássica(){}

  public static  FabricaSelvaJurássica getInstance(){
    if (instace == null){
      instace = new FabricaSelvaJurássica();
    }
    return instace;
  }
  public AnimalPerigoso createAnimalPerigoso() {
    return new TRex();
  }

  public AnimalTransporte createAnimalTransporte() {
    return new Pterodátilo();
  }
}
