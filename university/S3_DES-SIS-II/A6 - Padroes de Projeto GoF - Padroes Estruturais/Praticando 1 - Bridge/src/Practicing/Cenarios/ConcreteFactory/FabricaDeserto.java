package Practicing.Cenarios.ConcreteFactory;

import Practicing.Cenarios.AbstractFactory.FabricaCenario;
import Practicing.Cenarios.AbstractProduct.AnimalPerigoso;
import Practicing.Cenarios.AbstractProduct.AnimalTransporte;
import Practicing.Cenarios.Arbusto;
import Practicing.Cenarios.Cacto;
import Practicing.Cenarios.Vegetacao;

public class FabricaDeserto extends FabricaCenario {
  public AnimalPerigoso criarAnimalPerigoso() {
    return new Serpente();
  }

  public AnimalTransporte criarAnimalTransporte() {
    return new Dromedario();
  }

  public List<Vegetacao> criarVegetacao() {
    List<Vegetacao> vegetacoes = new ArrayList<>();
    vegetacoes.add(new Cacto());
    vegetacoes.add(new Arbusto());
    return vegetacoes;
  }
}
