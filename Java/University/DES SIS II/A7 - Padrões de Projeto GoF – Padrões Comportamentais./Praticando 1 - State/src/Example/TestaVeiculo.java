package Example;

public class TestaVeiculo {
  public static void main(String[] args) {
    Veiculo veiculo = new Veiculo();
    veiculo.acelerar(); // Deve imprimir "Acelerando o veículo."
    veiculo.frear(); // Deve imprimir "Não é possível frear enquanto o veículo está acelerando."
    veiculo.parar(); // Deve imprimir "Parando o veículo."
    veiculo.acelerar(); // Deve imprimir "Acelerando o veículo."
    veiculo.acelerar(); // Deve imprimir "O veículo já está acelerando."
    veiculo.frear(); // Deve imprimir "Freando o veículo."
    veiculo.frear(); // Deve imprimir "O veículo já está freando."
    veiculo.parar(); // Deve imprimir "Parando o veículo."
    veiculo.parar(); // Deve imprimir "O veículo já está parado."
    veiculo.frear(); // Deve imprimir "Não é possível frear enquanto o veículo está parado."
  }
}

