package AbstractDecorator;

import AbstractComponent.Cenario;

public abstract class VegetacaoDecorator implements Cenario {
  public Cenario cenario;

  public VegetacaoDecorator(Cenario cenario) {
    this.cenario = cenario;
  }

  public void descrição() {
    cenario.descrição();
  }
}

