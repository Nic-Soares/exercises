package Practicing.Cenarios.ConcreteFactory;

import Practicing.Cenarios.AbstractFactory.FabricaCenario;
import Practicing.Cenarios.AbstractProduct.AnimalPerigoso;
import Practicing.Cenarios.AbstractProduct.AnimalTransporte;
import Practicing.Cenarios.ArvoreGigante;
import Practicing.Cenarios.GrandeFolhagem;
import Practicing.Cenarios.Vegetacao;

public class FabricaSelvaJurassica extends FabricaCenario {
  public AnimalPerigoso criarAnimalPerigoso() {
    return new TRex();
  }

  public AnimalTransporte criarAnimalTransporte() {
    return new Pterodatilo();
  }

  public List<Vegetacao> criarVegetacao() {
    List<Vegetacao> vegetacoes = new ArrayList<>();
    vegetacoes.add(new ArvoreGigante());
    vegetacoes.add(new GrandeFolhagem());
    return vegetacoes;
  }
}
