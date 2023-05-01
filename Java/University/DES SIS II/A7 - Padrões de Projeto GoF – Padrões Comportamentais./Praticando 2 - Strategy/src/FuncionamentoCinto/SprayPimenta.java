package FuncionamentoCinto;

public class SprayPimenta extends UtilidadeDecorator {
  public SprayPimenta(Cinto cinto) {
    super(cinto);
  }

  @Override
  public void usar() {
    cinto.usar();
    System.out.println("Adicionando spray de pimenta...");
  }
}
