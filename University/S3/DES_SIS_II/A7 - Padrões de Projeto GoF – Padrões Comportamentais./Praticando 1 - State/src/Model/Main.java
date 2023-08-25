package Model;

// Uso do padrão State
public class Main {
  public static void main(String[] args) {
    // Cria o objeto de contexto
    Context context = new Context();

    // Executa a ação no estado atual (A)
    context.request();

    // Altera o estado para B
    context.setState(new StateB());

    // Executa a ação no novo estado (B)
    context.request();
  }
}
