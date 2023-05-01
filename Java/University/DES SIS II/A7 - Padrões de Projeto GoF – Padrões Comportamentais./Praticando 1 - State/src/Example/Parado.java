package Example;

// Classe que implementa o estado "parado"
public class Parado implements EstadoVeiculo {
  private Veiculo veiculo;

  public Parado(Veiculo veiculo) {
    this.veiculo = veiculo;
  }

  public void acelerar() {
    System.out.println("Acelerando o veículo.");
    veiculo.setEstadoAtual(new Acelerando(veiculo));
  }

  public void frear() {
    System.out.println("Não é possível frear enquanto o veículo está parado.");
  }

  public void parar() {
    System.out.println("O veículo já está parado.");
  }
}
