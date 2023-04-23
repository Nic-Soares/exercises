package Example;

public class Leite extends Adicional {
  public Leite(Bebida bebida) {
    super(bebida);
  }

  public String getDescricao() {
    return super.getDescricao() + ", Leite";
  }

  public double getCusto() {
    return super.getCusto() + 0.75;
  }
}
