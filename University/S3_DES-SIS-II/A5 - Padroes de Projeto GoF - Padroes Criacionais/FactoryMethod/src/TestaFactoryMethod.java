public class TestaFactoryMethod {
  public static void main(String[] args) {
    System.out.println("Bem-vindo ao jogo As Aventuras de Superpadrãozinho!");

    // Cria a fábrica de cenário do deserto
    System.out.println("Criando cenário do deserto...");
    FabricaCenario fabricaDeserto = new FabricaCenarioDeserto();

    // Cria um cenário do deserto
    Cenario cenarioDeserto = fabricaDeserto.criarCenario();
    System.out.println("Cenário do deserto criado com sucesso!");
    cenarioDeserto.iniciar();

    // Cria a fábrica de cenário da selva jurássica
    System.out.println("Criando cenário da selva jurássica...");
    FabricaCenario fabricaSelvaJurassica = new FabricaCenarioSelvaJurassica();

    // Cria um cenário da selva jurássica
    Cenario cenarioSelvaJurassica = fabricaSelvaJurassica.criarCenario();
    System.out.println("Cenário da selva jurássica criado com sucesso!");
    cenarioSelvaJurassica.iniciar();

    System.out.println("Fim do jogo. Obrigado por jogar As Aventuras de Superpadrãozinho!");
  }
}






