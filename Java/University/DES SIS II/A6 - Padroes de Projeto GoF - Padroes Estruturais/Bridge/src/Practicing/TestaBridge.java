package Practicing;

public class TestaBridge {
  public static void main(String[] args) {
    Personagem personagem = new SuperpadrãozinhoImpl();

    personagem.apresentar(); // deve imprimir "Superpadrãozinho (sem avatar)"

    personagem.setAvatar(new AvatarMasculino());
    personagem.apresentar(); // deve imprimir "Superpadrãozinho (Masculino)"

    personagem.setAvatar(new AvatarFeminino());
    personagem.apresentar(); // deve imprimir "Superpadrãozinho (Feminino)"

    personagem.setAvatar(new AvatarMasculino());
    personagem.apresentar(); // deve imprimir "Superpadrãozinho (Masculino)"
  }
}

