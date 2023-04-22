package Model;

// Implementação da fábrica abstrata 2
public class ConcreteFactory2 extends AbstractFactory {
  public AbstractProductA createProductA() {
    return new ProductA2();
  }

  public AbstractProductB createProductB() {
    return new ProductB2();
  }
}