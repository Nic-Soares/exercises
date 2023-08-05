public class Cliente {
  String nome;
  int agencia, conta;
  double saldo;

  public void depositar(double valor){
    saldo += valor;
  }

  public double consultaSaldo(){
    return saldo;
  }
}
