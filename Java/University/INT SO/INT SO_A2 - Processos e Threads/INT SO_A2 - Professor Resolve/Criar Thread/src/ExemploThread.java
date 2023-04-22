
public class ExemploThread {
  public static void main(String[] args) {
    System.out.println("Aula sobre Threads");

    // Criar uma nova thread dentro do programa

    ClasseDaThread ta = new ClasseDaThread();

    ta.start();

    for (int i = 0; i < 100; i++) {
      System.out.println("Aula sobre Threads");
    }

    ClasseDaThread tb = new ClasseDaThread();

    tb.start();

  }
}
