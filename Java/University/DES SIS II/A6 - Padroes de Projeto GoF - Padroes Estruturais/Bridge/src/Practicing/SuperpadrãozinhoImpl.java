package Practicing;

// Classe concreta para a abstração
public class SuperpadrãozinhoImpl implements Personagem {
  private Avatar avatar;

  @Override
  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  @Override
  public void apresentar() {
    if (avatar != null) {
      avatar.apresentar();
    } else {
      System.out.println("Superpadrãozinho (sem avatar)");
    }
  }
}
