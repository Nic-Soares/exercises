package CriacaoPersonagem;

import CriacaoPersonagem.Idade.FaixaEtaria;
import CriacaoPersonagem.State.EstadoPersonagem;
import CriacaoPersonagem.State.PersonagemComDano;
import CriacaoPersonagem.State.PersonagemSaudavel;
import FuncionamentoCinto.Strategy.Arma;

public class Superpadrãozinho implements Personagem {
  private Avatar avatar;
  private FaixaEtaria faixaEtaria;
  private EstadoPersonagem estado;
  private Arma arma;

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

  public void setArma(Arma arma) {
    this.arma = arma;
  }

  public void lutar(int quantidadeAnimais) {
    if (quantidadeAnimais >= 5) {
      arma.defender();
    } else {
      arma.atacar();
    }
  }
}
