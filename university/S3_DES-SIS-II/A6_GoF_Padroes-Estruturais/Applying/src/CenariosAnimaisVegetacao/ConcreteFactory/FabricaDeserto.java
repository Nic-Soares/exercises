package CenariosAnimaisVegetacao.ConcreteFactory;

import CenariosAnimaisVegetacao.AbstractFactory.FabricaCenario;
import CenariosAnimaisVegetacao.AbstractProduct.*;
import CenariosAnimaisVegetacao.Product.*;

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
