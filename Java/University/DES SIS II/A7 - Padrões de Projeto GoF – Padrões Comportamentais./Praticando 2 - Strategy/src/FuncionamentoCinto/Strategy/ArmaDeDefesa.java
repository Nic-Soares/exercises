package FuncionamentoCinto.Strategy;

public class ArmaDeDefesa implements Arma {
  @Override
  public void atacar() {
    System.out.println("Usando arma de defesa para atacar os animais perigosos.");
  }

  @Override
  public void defender() {
    System.out.println("Usando arma de defesa para se defender dos animais perigosos.");
  }
}
