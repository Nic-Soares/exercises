import CriacaoPersonagem.Superpadrãozinho;

public class Main {
  public static void main(String[] args) {
    // Criando um Superpadrãozinho saudável
    Superpadrãozinho personagem = new Superpadrãozinho();

    // Definindo avatar e faixa etária do personagem
    personagem.setAvatar(new AvatarSuper());
    personagem.setFaixaEtaria(new FaixaEtariaLivre());

    // Apresentando o personagem
    personagem.apresentar();

    // Definindo a arma do personagem como uma espada
    personagem.setArma(new Espada());

    // Lutando com 3 animais
    personagem.lutar(3);

    // Recebendo um ataque e ficando com dano
    personagem.receberAtaque();
    personagem.setEstado(personagem.getComDano());

    // Lutando com 7 animais
    personagem.lutar(7);

    // Curando o personagem
    personagem.curar();

    // Lutando com 10 animais
    personagem.lutar(10);
  }
}

