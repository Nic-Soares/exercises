package Model;

public class Main {
  public static void main(String[] args) {
    // Cria a fábrica abstrata 1
    AbstractFactory factory1 = new ConcreteFactory1();

    // Cria um cliente que usa a fábrica abstrata 1
    Client client1 = new Client(factory1);

    // Faz algo usando os produtos criados pela fábrica abstrata 1
    client1.doSomething();

    // Cria a fábrica abstrata 2
    AbstractFactory factory2 = new ConcreteFactory2();

    // Cria um cliente que usa a fábrica abstrata 2
    Client client2 = new Client(factory2);

    // Faz algo usando os produtos criados pela fábrica abstrata 2
    client2.doSomething();
  }
}
