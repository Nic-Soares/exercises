package FuncionamentoCinto.Strategy;

public class ArmaDeAtaque implements Arma {
  @Override
  public void atacar() {
    System.out.println("Usando arma de ataque para atacar os animais perigosos.");
  }

  @Override
  public void defender() {
    System.out.println("Usando arma de ataque para se defender dos animais perigosos.");
  }
}
