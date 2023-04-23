package Praticing.FuncionamentoCinto;

public class BoteInflavel extends UtilidadeDecorator {
  public BoteInflavel(Cinto cinto) {
    super(cinto);
  }

  @Override
  public void usar() {
    cinto.usar();
    System.out.println("Adicionando bote inflável...");
  }
}
