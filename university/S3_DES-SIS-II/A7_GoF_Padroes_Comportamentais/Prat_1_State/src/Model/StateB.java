package Model;

// Exemplo de outro estado concreto
class StateB implements State {
  @Override
  public void handle() {
    System.out.println("Executando ação no estado B");

    // Lógica de transição de estado
    // ...
  }
}
