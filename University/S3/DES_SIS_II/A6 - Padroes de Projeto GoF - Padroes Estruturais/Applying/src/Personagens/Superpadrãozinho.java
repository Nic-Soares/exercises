package Personagens;

public class Superpadrãozinho implements Personagem {
  private Avatar avatar;
  private FaixaEtaria faixaEtaria;

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
}
