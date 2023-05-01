package Model;

// Implementação concreta do decorador
public class DecoradorConcreto extends Decorador {
  public DecoradorConcreto(Componente componente) {
    super(componente);
  }

  public void operacao() {
    super.operacao();
    System.out.println("Operação do decorador concreto.");
  }
}
