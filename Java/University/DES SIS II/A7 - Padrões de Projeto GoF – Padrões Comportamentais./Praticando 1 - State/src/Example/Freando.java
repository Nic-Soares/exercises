package Example;

// Classe que implementa o estado "freando"
public class Freando implements EstadoVeiculo {
  private Veiculo veiculo;

  public Freando(Veiculo veiculo) {
    this.veiculo = veiculo;
  }

  public void acelerar() {
    System.out.println("Acelerando o veículo.");
    veiculo.setEstadoAtual(new Acelerando(veiculo));
  }

  public void frear() {
    System.out.println("O veículo já está freando.");
  }

  public void parar() {
    System.out.println("Parando o veículo.");
    veiculo.setEstadoAtual(new Parado(veiculo));
  }
}
