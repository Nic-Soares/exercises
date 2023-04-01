// Implementação do padrão Abstract Factory em Java
// Font: https://www.dofactory.com/net/abstract-factory-design-pattern

package Model;

import Model.AbstractFactory.ContinentFactory;
import Model.Client.AnimalWorld;
import Model.ConcreteFactory.AfricaFactory;
import Model.ConcreteFactory.AmericaFactory;
public class Main {
  public static void main(String[] args) {
    ContinentFactory africafactory = new AfricaFactory();
    AnimalWorld africaWorld = new AnimalWorld(africafactory);
    africaWorld.runFoodChain();

    ContinentFactory americaFactory = new AmericaFactory();
    AnimalWorld americaWorld = new AnimalWorld(americaFactory);
    americaWorld.runFoodChain();
  }
}
