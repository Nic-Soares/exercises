package FuncionamentoCinto;

public class Paraquedas extends UtilidadeDecorator {
  public Paraquedas(Cinto cinto) {
    super(cinto);
  }

  @Override
  public void usar() {
    cinto.usar();
    System.out.println("Adicionando paraquedas...");
  }
}
