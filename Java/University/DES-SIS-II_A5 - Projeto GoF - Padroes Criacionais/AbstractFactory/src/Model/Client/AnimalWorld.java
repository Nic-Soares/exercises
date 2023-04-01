package Model.Client;

import Model.AbstractFactory.ContinentFactory;
import Model.AbstractProduct.Carnivore;
import Model.AbstractProduct.Herbivore;

public class AnimalWorld {
  private Herbivore herbivore;
  private Carnivore carnivore;

  public AnimalWorld(ContinentFactory factory){
    herbivore = factory.createHerbivore();
    carnivore = factory.createCarnivore();
  }

  public void runFoodChain(){
    carnivore.eat();
    herbivore.eat();
  }
}
