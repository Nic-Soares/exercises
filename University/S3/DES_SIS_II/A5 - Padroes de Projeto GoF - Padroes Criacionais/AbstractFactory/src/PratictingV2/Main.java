package PratictingV2;

import PratictingV2.AbstractFactory.FabricaCenario;
import PratictingV2.Client.MundoAnimal;
import PratictingV2.ConcreteFactory.FabricaDeserto;
import PratictingV2.ConcreteFactory.FabricaSelvaJurássica;

public class Main {
  public static void main(String[] args) {
    FabricaCenario fabricaDeserto = new FabricaDeserto();
    MundoAnimal mundoDeserto = new MundoAnimal(fabricaDeserto);
    mundoDeserto.runAnimalFeatures();

    FabricaCenario fabricaSelva = new FabricaSelvaJurássica();
    MundoAnimal mundoSelva = new MundoAnimal(fabricaSelva);
    mundoSelva.runAnimalFeatures();
  }
}
