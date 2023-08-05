// Implementação do padrão Abstract Factory em Java
// Font: https://www.dofactory.com/net/abstract-factory-design-pattern

package Example;

import Example.AbstractFactory.ContinentFactory;
import Example.Client.AnimalWorld;
import Example.ConcreteFactory.AfricaFactory;
import Example.ConcreteFactory.AmericaFactory;
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
