package Example;

// Classe que implementa o estado "acelerando"
public class Acelerando implements EstadoVeiculo {
  private Veiculo veiculo;

  public Acelerando(Veiculo veiculo) {
    this.veiculo = veiculo;
  }

  public void acelerar() {
    System.out.println("O veículo já está acelerando.");
  }

  public void frear() {
    System.out.println("Freando o veículo.");
    veiculo.setEstadoAtual(new Freando(veiculo));
  }

  public void parar() {
    System.out.println("Parando o veículo.");
    veiculo.setEstadoAtual(new Parado(veiculo));
  }
}
