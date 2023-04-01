package Practicing;

public class TestaAbstractFactory {
  public static void main(String[] args) {
    FabricaAnimais fabricaDeserto = new FabricaAnimaisDeserto();
    AnimalPerigoso serpente = fabricaDeserto.criarAnimalPerigoso();
    AnimalTransporte dromedario = fabricaDeserto.criarAnimalTransporte();
    serpente.atacar();
    dromedario.cavalgar();

    FabricaAnimais fabricaSelvaJurassica = new FabricaAnimaisSelvaJurassica();
    AnimalPerigoso tRex = fabricaSelvaJurassica.criarAnimalPerigoso();
    AnimalTransporte pterodatilo = fabricaSelvaJurassica.criarAnimalTransporte();

    tRex.atacar();
    pterodatilo.cavalgar();
  }
}