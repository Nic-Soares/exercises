package Model;

public class Main {
  public static void main(String[] args) {
    // Test the correct Singleton implementation
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    System.out.println("Singleton1 é a mesma instância que Singleton2? " + (singleton1 == singleton2));

    // Test the incorrect Singleton implementation
    SingletonIncorrect singletonIncorrect1 = new SingletonIncorrect();
    SingletonIncorrect singletonIncorrect2 = new SingletonIncorrect();

    System.out.println("SingletonIncorrect1 é a mesma instância que SingletonIncorrect2? " + (singletonIncorrect1.equals(singletonIncorrect2)));
  }
}

