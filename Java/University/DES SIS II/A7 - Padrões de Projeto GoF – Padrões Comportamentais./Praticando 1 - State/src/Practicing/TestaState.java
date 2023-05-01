package Practicing;

import Practicing.Genero.AvatarMasculino;
import Practicing.Idade.Adulto;

public class TestaState {
  public static void main(String[] args) {
    Superpadrãozinho personagem = new Superpadrãozinho();
    personagem.setAvatar(new AvatarMasculino());
    personagem.setFaixaEtaria(new Adulto());
    personagem.apresentar();

    // personagem começa saudável
    boolean saudavel = true;

    // simula receber dano
    for (int i = 0; i < 3; i++) {
      saudavel = !saudavel;
      if (saudavel) {
        System.out.println("Personagem está saudável");
      } else {
        System.out.println("Personagem está com dano");
      }
      personagem.setAvatar(new AvatarMasculino()); // apenas para manter consistência com primeiro teste
      personagem.setFaixaEtaria(new Adulto()); // apenas para manter consistência com primeiro teste
      personagem.apresentar();
    }
  }
}

