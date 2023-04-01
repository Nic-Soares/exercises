package Model.AbstractFactory;

import Model.AbstractProduct.Herbivore;
import Model.AbstractProduct.Carnivore;

public abstract class ContinentFactory {
  public abstract Herbivore createHerbivore();
  public abstract Carnivore createCarnivore();
}
