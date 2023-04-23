package Model;

// Classe cliente que usa a abstração e a implementação da interface Bridge
public class Cliente {
  public static void main(String[] args) {
    Implementador implementadorA = new ImplementadorConcretoA();
    Abstracao abstracao = new AbstracaoConcreta(implementadorA);
    abstracao.operacao();

    Implementador implementadorB = new ImplementadorConcretoB();
    abstracao = new AbstracaoConcreta(implementadorB);
    abstracao.operacao();
  }
}
