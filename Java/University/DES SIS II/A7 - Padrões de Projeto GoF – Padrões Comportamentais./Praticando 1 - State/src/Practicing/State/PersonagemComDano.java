package Practicing.State;

import Practicing.Superpadrãozinho;

public class PersonagemComDano implements EstadoPersonagem {
  private Superpadrãozinho personagem;

  public PersonagemComDano(Superpadrãozinho personagem) {
    this.personagem = personagem;
  }

  @Override
  public void receberAtaque() {
    System.out.println("Personagem já está com dano!");
  }

  @Override
  public void curar() {
    // Deixa o método vazio
  }
}
