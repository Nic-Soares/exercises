package Personagens;

public class TestaPersonagem {
  public static void main(String[] args) {
    Personagem personagem1 = new Superpadrãozinho();
    personagem1.setAvatar(new AvatarFeminino());
    personagem1.setFaixaEtaria(new Adulto());
    personagem1.apresentar(); // saída: Superpadrãozinho (Feminino) Adulto

    Personagem personagem2 = new Superpadrãozinho();
    personagem2.setAvatar(new AvatarMasculino());
    personagem2.setFaixaEtaria(new Crianca());
    personagem2.apresentar(); // saída: Superpadrãozinho (Masculino) Criança
  }
}
