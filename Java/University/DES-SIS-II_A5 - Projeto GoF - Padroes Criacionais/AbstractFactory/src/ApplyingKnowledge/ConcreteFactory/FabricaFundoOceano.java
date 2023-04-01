package ApplyingKnowledge.ConcreteFactory;

import ApplyingKnowledge.Product.CavaloMarinho;
import ApplyingKnowledge.Product.TubarãoBranco;
import ApplyingKnowledge.AbstractFactory.FabricaCenario;
import ApplyingKnowledge.AbstractProduct.AnimalPerigoso;
import ApplyingKnowledge.AbstractProduct.AnimalTransporte;
import ApplyingKnowledge.Product.Pterodátilo;
import ApplyingKnowledge.Product.TRex;

public class FabricaFundoOceano extends FabricaCenario {
  private static FabricaFundoOceano instace = null;

  private FabricaFundoOceano(){}

  public static  FabricaFundoOceano getInstance(){
    if (instace == null){
      instace = new FabricaFundoOceano();
    }
    return instace;
  }

  public AnimalPerigoso createAnimalPerigoso() {
    return new TubarãoBranco();
  }

  public AnimalTransporte createAnimalTransporte() {
    return new CavaloMarinho();
  }
}
