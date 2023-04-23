package Example;

public abstract class Adicional implements Bebida {
  private Bebida bebida;

  public Adicional(Bebida bebida) {
    this.bebida = bebida;
  }

  public String getDescricao() {
    return bebida.getDescricao();
  }

  public double getCusto() {
    return bebida.getCusto();
  }
}
