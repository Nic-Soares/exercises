package Example.ConcreteFactory;

import Example.AbstractFactory.ContinentFactory;
import Example.AbstractProduct.Herbivore;
import Example.AbstractProduct.Carnivore;
import Example.Product.Bison;
import Example.Product.Wolf;

public class AmericaFactory extends ContinentFactory {
  public Herbivore createHerbivore(){
    return new Bison();
  }

  public Carnivore createCarnivore(){
    return new Wolf();
  }
}
