package ApplyingKnowledge;

import ApplyingKnowledge.ConcreteFactory.FabricaFundoOceano;
import ApplyingKnowledge.AbstractFactory.FabricaCenario;
import ApplyingKnowledge.Client.MundoAnimal;
import ApplyingKnowledge.ConcreteFactory.FabricaDeserto;
import ApplyingKnowledge.ConcreteFactory.FabricaSelvaJurássica;

public class Main {
  public static void main(String[] args) {
    FabricaCenario fabricaDeserto = FabricaDeserto.getInstance();
    MundoAnimal mundoDeserto = new MundoAnimal(fabricaDeserto);
    mundoDeserto.runAnimalFeatures();

    FabricaCenario fabricaSelva = FabricaSelvaJurássica.getInstance();
    MundoAnimal mundoSelva = new MundoAnimal(fabricaSelva);
    mundoSelva.runAnimalFeatures();

    FabricaCenario fabricaOceano = FabricaFundoOceano.getInstance();
    MundoAnimal mundoOceano = new MundoAnimal(fabricaOceano);
    mundoOceano.runAnimalFeatures();
  }
}
