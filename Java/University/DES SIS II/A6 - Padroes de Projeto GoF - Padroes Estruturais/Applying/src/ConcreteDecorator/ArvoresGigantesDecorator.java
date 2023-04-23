package ConcreteDecorator;

import AbstractComponent.Cenario;
import AbstractDecorator.VegetacaoDecorator;

public class ArvoresGigantesDecorator extends VegetacaoDecorator {
  public ArvoresGigantesDecorator(Cenario cenario) {
    super(cenario);
  }

  public void descrição() {
    super.descrição();
    System.out.println("Com árvores gigantes e grandes folhagens");
  }
}
