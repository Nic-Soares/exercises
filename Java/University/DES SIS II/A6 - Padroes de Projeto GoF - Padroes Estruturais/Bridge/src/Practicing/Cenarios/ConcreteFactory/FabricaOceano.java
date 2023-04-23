package Practicing.Cenarios.ConcreteFactory;

import Practicing.Cenarios.AbstractFactory.FabricaCenario;
import Practicing.Cenarios.AbstractProduct.AnimalPerigoso;
import Practicing.Cenarios.AbstractProduct.AnimalTransporte;
import Practicing.Cenarios.Algas;
import Practicing.Cenarios.Cogumelo;
import Practicing.Cenarios.Vegetacao;

public class FabricaOceano extends FabricaCenario {
  public AnimalPerigoso criarAnimalPerigoso() {
    return null;
  }

  public AnimalTransporte criarAnimalTransporte() {
    return new Baleia();
  }

  public List<Vegetacao> criarVegetacao() {
    List<Vegetacao> vegetacoes = new ArrayList<>();
    vegetacoes.add(new Algas());
    vegetacoes.add(new Cogumelo());
    return vegetacoes;
  }
}