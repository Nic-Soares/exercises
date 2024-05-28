package Model;

// Exemplo de um estado concreto
class StateA implements State {
  @Override
  public void handle() {
    System.out.println("Executando ação no estado A");

    // Lógica de transição de estado
    // ...
  }
}
