package Model;

public class SingletonIncorrect {
  private static SingletonIncorrect instance;

  public SingletonIncorrect() {}

  public static SingletonIncorrect getInstance() {
    if (instance == null) {
      instance = new SingletonIncorrect();
    }
    return instance;
  }

  // Other methods and properties of the Singleton class go here
  public void doSomething() {
    // Code to do something goes here
  }
}
