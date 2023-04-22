package Model;

// Classe cliente que usa as fábricas abstratas e seus produtos abstratos
public class Client {
  private AbstractProductA productA;
  private AbstractProductB productB;

  public Client(AbstractFactory factory) {
    productA = factory.createProductA();
    productB = factory.createProductB();
  }

  public void doSomething() {
    System.out.println("Client is using " + productA.getName() + " and " + productB.getName());
  }
}
