package Model;

// Implementação da fábrica abstrata 1
public class ConcreteFactory1 extends AbstractFactory {
  public AbstractProductA createProductA() {
    return new ProductA1();
  }

  public AbstractProductB createProductB() {
    return new ProductB1();
  }
}
