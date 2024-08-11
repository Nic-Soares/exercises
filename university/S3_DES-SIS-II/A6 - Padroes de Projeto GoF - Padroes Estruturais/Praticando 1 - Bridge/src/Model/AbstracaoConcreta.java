package Model;

// Abstração específica que usa a implementação da interface Bridge
class AbstracaoConcreta extends Abstracao {
  public AbstracaoConcreta(Implementador implementador) {
    super(implementador);
  }

  public void operacao() {
    implementador.operacaoImplementada();
  }
}
