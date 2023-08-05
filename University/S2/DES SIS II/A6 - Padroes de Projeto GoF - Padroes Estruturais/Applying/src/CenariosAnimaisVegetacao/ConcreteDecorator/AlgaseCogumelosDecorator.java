package CenariosAnimaisVegetacao.ConcreteDecorator;

import CenariosAnimaisVegetacao.AbstractComponent.*;
import CenariosAnimaisVegetacao.AbstractDecorator.*;

public class AlgaseCogumelosDecorator extends VegetacaoDecorator {
  public AlgaseCogumelosDecorator(Cenario cenario) {
    super(cenario);
  }

  public void descrição() {
    super.descrição();
    System.out.println("Com algas e cogumelos");
  }
}

