package FuncionamentoCinto.Strategy;

public class Superpadrãozinho {
  private Arma arma;

  public void setArma(Arma arma) {
    this.arma = arma;
  }

  public void lutar(int quantidadeAnimais) {
    if (quantidadeAnimais >= 5) {
      arma.defender();
    } else {
      arma.atacar();
    }
  }
}
