package Practicing.Cenarios.AbstractFactory;

import Practicing.Cenarios.Vegetacao;

public abstract class FabricaCenario {
  public abstract AnimalPerigoso criarAnimalPerigoso();
  public abstract AnimalTransporte criarAnimalTransporte();
  public abstract List<Vegetacao> criarVegetacao();
}