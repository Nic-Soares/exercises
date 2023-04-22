package Model;

public class Singleton {
  private static Singleton instance;

  // Construtor privado para evitar instanciação de fora
  private Singleton() {}

  public static Singleton getInstance(){
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public void soSomething() {

  }
}
