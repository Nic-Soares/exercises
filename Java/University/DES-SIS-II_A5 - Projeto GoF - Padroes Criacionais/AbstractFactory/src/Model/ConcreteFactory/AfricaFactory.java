package Model.ConcreteFactory;

import Model.AbstractFactory.ContinentFactory;
import Model.AbstractProduct.Carnivore;
import Model.AbstractProduct.Herbivore;
import Model.Product.Lion;
import Model.Product.Wildebeest;

public class AfricaFactory extends ContinentFactory {
  public Herbivore createHerbivore() {
    return new Wildebeest();
  }

  public Carnivore createCarnivore() {
    return new Lion();
  }
}
