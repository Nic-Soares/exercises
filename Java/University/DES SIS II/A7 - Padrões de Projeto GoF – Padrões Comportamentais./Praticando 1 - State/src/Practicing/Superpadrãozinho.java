package Practicing;

import Practicing.Idade.FaixaEtaria;
import Practicing.State.EstadoPersonagem;
import Practicing.State.PersonagemComDano;
import Practicing.State.PersonagemSaudavel;

public class Superpadrãozinho implements Personagem {
  private Avatar avatar;
  private FaixaEtaria faixaEtaria;
  private EstadoPersonagem estado;

  public Superpadrãozinho() {
    // Inicializa o personagem como saudável
    this.estado = new PersonagemSaudavel(this);
  }

  @Override
  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  @Override
  public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
    this.faixaEtaria = faixaEtaria;
  }

  @Override
  public void apresentar() {
    if (avatar != null) {
      System.out.print("Superpadrãozinho ");
      avatar.apresentar();
    } else {
      System.out.print("Superpadrãozinho (sem avatar) ");
    }

    if (faixaEtaria != null) {
      System.out.println(faixaEtaria.getDescricao());
    } else {
      System.out.println("(sem faixa etária)");
    }
  }

  // Métodos para transicionar entre os estados
  public void setEstado(EstadoPersonagem estado) {
    this.estado = estado;
  }

  public EstadoPersonagem getSaudavel() {
    return new PersonagemSaudavel(this);
  }

  public EstadoPersonagem getComDano() {
    return new PersonagemComDano(this);
  }

  // Métodos para realizar ações de acordo com o estado atual
  public void receberAtaque() {
    estado.receberAtaque();
  }

  public void curar() {
    estado.curar();
  }
}
