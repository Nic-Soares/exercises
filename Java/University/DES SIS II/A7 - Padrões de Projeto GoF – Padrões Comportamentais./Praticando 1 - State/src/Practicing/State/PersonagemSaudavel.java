package Practicing.State;


import Practicing.Superpadrãozinho;

public class PersonagemSaudavel implements EstadoPersonagem {
  private Superpadrãozinho personagem;

  public PersonagemSaudavel(Superpadrãozinho personagem) {
    this.personagem = personagem;
  }

  @Override
  public void receberAtaque() {
    System.out.println("Personagem recebeu dano!");
    personagem.setEstado(personagem.getComDano());
  }

  @Override
  public void curar() {
    System.out.println("Personagem já está saudável!");
  }
}
