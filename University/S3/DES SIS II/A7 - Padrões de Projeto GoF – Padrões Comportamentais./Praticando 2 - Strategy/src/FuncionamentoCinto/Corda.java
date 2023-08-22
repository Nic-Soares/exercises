package FuncionamentoCinto;

// Classes concretas para cada uma das utilidades (decoradores)
public class Corda extends UtilidadeDecorator {
  public Corda(Cinto cinto) {
    super(cinto);
  }

  @Override
  public void usar() {
    cinto.usar();
    System.out.println("Adicionando corda...");
  }
}
