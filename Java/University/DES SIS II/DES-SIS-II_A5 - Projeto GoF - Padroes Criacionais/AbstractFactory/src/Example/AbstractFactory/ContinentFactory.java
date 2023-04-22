package Example.AbstractFactory;

import Example.AbstractProduct.Herbivore;
import Example.AbstractProduct.Carnivore;

public abstract class ContinentFactory {
  public abstract Herbivore createHerbivore();
  public abstract Carnivore createCarnivore();
}
