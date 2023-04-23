package ConcreteFactory;


import AbstractFactory.FabricaCenario;
import AbstractProduct.*;
import Product.*;

public class FabricaSelvaJurassica extends FabricaCenario {
  private static FabricaSelvaJurassica instace = null;

  private FabricaSelvaJurassica(){}

  public static FabricaSelvaJurassica getInstance(){
    if (instace == null){
      instace = new FabricaSelvaJurassica();
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
