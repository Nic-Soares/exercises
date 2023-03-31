// Subclasse concreta de FabricaCenario para criar o cenário do deserto
public class FabricaCenarioDeserto extends FabricaCenario {
  @Override
  public Cenario criarCenario() {
    return new CenarioDeserto();
  }
}
