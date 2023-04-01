package Example.ConcreteFactory;

import Example.AbstractFactory.ContinentFactory;
import Example.AbstractProduct.Carnivore;
import Example.AbstractProduct.Herbivore;
import Example.Product.Lion;
import Example.Product.Wildebeest;

public class AfricaFactory extends ContinentFactory {
  public Herbivore createHerbivore() {
    return new Wildebeest();
  }

  public Carnivore createCarnivore() {
    return new Lion();
  }
}
