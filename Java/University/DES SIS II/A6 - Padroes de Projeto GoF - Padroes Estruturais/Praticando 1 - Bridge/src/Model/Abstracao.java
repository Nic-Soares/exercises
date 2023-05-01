package Model;

// Abstração que usa a interface Bridge
abstract class Abstracao {
  protected Implementador implementador;

  public Abstracao(Implementador implementador) {
    this.implementador = implementador;
  }

  public abstract void operacao();
}
