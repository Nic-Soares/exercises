package Model;

// Classe que contém o estado atual e a lógica de transição de estado
class Context {
  private State state;

  public Context() {
    // Defina um estado inicial aqui
    state = new StateA();
  }

  public void setState(State state) {
    this.state = state;
  }

  public void request() {
    // Delega a ação ao estado atual
    state.handle();
  }
}
