package Example.Client;

import Example.AbstractFactory.ContinentFactory;
import Example.AbstractProduct.Carnivore;
import Example.AbstractProduct.Herbivore;

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
