package Model;

// Cliente
public class Cliente {
  public static void main(String[] args) {
    Componente componente = new ComponenteConcreto();
    componente.operacao();

    Componente decorador = new DecoradorConcreto(new ComponenteConcreto());
    decorador.operacao();
  }
}
