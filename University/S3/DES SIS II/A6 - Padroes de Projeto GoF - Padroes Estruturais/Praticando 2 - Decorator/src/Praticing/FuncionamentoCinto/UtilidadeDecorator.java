package Praticing.FuncionamentoCinto;

// Classe abstrata para os decoradores
public abstract class UtilidadeDecorator implements Cinto {
  protected Cinto cinto;

  public UtilidadeDecorator(Cinto cinto) {
    this.cinto = cinto;
  }
}
