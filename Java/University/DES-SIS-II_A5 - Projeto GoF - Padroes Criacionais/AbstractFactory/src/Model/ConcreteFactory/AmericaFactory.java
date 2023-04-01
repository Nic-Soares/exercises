package Model.ConcreteFactory;

import Model.AbstractFactory.ContinentFactory;
import Model.AbstractProduct.Herbivore;
import Model.AbstractProduct.Carnivore;
import Model.Product.Bison;
import Model.Product.Wolf;

public class AmericaFactory extends ContinentFactory {
  public Herbivore createHerbivore(){
    return new Bison();
  }

  public Carnivore createCarnivore(){
    return new Wolf();
  }
}
