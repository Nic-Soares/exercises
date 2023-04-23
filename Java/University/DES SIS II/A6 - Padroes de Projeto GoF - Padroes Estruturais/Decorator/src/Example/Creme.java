package Example;

public class Creme extends Adicional {
  public Creme(Bebida bebida) {
    super(bebida);
  }

  public String getDescricao() {
    return super.getDescricao() + ", Creme";
  }

  public double getCusto() {
    return super.getCusto() + 0.5;
  }
}
