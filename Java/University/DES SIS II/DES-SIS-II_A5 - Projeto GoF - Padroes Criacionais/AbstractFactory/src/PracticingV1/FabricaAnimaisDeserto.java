package PracticingV1;

// Implementação da fábrica de animais para o cenário do deserto
public class FabricaAnimaisDeserto implements FabricaAnimais {
  public AnimalPerigoso criarAnimalPerigoso() {
    return new Serpente();
  }

  public AnimalTransporte criarAnimalTransporte() {
    return new Dromedario();
  }
}
