package CenariosAnimaisVegetacao.ConcreteDecorator;

import CenariosAnimaisVegetacao.AbstractComponent.Cenario;
import CenariosAnimaisVegetacao.AbstractDecorator.VegetacaoDecorator;

public class CactosDecorator extends VegetacaoDecorator {
  public CactosDecorator(Cenario cenario) {
    super(cenario);
  }

  public void descrição() {
    super.descrição();
    System.out.println("Com cactos e arbustos");
  }
}

