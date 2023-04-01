package ApplyingKnowledge;

import ApplyingKnowledge.ConcreteFactory.FabricaFundoOceano;
import ApplyingKnowledge.AbstractFactory.FabricaCenario;
import ApplyingKnowledge.Client.MundoAnimal;
import ApplyingKnowledge.ConcreteFactory.FabricaDeserto;
import ApplyingKnowledge.ConcreteFactory.FabricaSelvaJurássica;

public class Main {
  public static void main(String[] args) {
    FabricaCenario fabricaDeserto = new FabricaDeserto();
    MundoAnimal mundoDeserto = new MundoAnimal(fabricaDeserto);
    mundoDeserto.runAnimalFeatures();

    FabricaCenario fabricaSelva = new FabricaSelvaJurássica();
    MundoAnimal mundoSelva = new MundoAnimal(fabricaSelva);
    mundoSelva.runAnimalFeatures();

    FabricaCenario fabricaOceano = new FabricaFundoOceano();
    MundoAnimal mundoOceano = new MundoAnimal(fabricaOceano);
    mundoOceano.runAnimalFeatures();
  }
}
