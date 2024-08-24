import CenariosAnimaisVegetacao.AbstractComponent.Cenario;
import CenariosAnimaisVegetacao.Client.MundoAnimal;
import CenariosAnimaisVegetacao.ConcreteComponent.Deserto;
import CenariosAnimaisVegetacao.ConcreteDecorator.CactosDecorator;
import CenariosAnimaisVegetacao.ConcreteFactory.FabricaDeserto;
import Personagens.*;

public class Main {
  public static void main(String[] args) {
    Personagem personagem1 = new Superpadrãozinho();
    personagem1.setAvatar(new AvatarFeminino());
    personagem1.setFaixaEtaria(new Adulto());
    personagem1.apresentar(); // saída: Superpadrãozinho (Feminino) Adulto

    // Criando o cenário inicial
    Cenario deserto = new Deserto();

    // Criando a fábrica de animais do deserto
    FabricaDeserto fabricaDeserto = FabricaDeserto.getInstance();

    // Criando o mundo animal com o cenário inicial e a fábrica de animais do deserto
    MundoAnimal mundoAnimal = new MundoAnimal(fabricaDeserto, deserto);

    // Adicionando cactos e arbustos no deserto
    mundoAnimal.setVegetacaoDecorator(new CactosDecorator(deserto));
    mundoAnimal.runAnimalFeatures();

  }
}
