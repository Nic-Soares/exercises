public class ClasseDaThread extends Thread{
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Teste da Thread");
    }
  }
}
