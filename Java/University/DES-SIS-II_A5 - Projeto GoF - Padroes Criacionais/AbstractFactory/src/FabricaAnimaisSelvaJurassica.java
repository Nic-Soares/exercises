// Implementação da fábrica de animais para o cenário da selva jurássica
public class FabricaAnimaisSelvaJurassica implements FabricaAnimais {
  public AnimalPerigoso criarAnimalPerigoso() {
    return new TRex();
  }

  public AnimalTransporte criarAnimalTransporte() {
    return new Pterodatilo();
  }
}
