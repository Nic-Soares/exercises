package Example;

// Classe Veiculo representa o contexto que contém um estado
public class Veiculo {
  private EstadoVeiculo estadoAtual;

  public Veiculo() {
    estadoAtual = new Parado(this); // O veículo começa em um estado "parado"
  }

  // Método que permite mudar o estado atual do veículo
  public void setEstadoAtual(EstadoVeiculo estado) {
    estadoAtual = estado;
  }

  // Método que delega o comportamento do veículo para o estado atual
  public void acelerar() {
    estadoAtual.acelerar();
  }

  public void frear() {
    estadoAtual.frear();
  }

  public void parar() {
    estadoAtual.parar();
  }
}

