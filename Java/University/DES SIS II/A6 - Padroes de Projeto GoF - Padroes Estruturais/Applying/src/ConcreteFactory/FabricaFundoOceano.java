package ConcreteFactory;


import AbstractFactory.FabricaCenario;
import AbstractProduct.*;
import Product.*;

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
