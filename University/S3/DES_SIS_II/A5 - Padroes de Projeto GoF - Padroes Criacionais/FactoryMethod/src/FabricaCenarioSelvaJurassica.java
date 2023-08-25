// Subclasse concreta de FabricaCenario para criar o cenário da selva jurássica
public class FabricaCenarioSelvaJurassica extends FabricaCenario {
  @Override
  public Cenario criarCenario() {
    return new CenarioSelvaJurassica();
  }
}
