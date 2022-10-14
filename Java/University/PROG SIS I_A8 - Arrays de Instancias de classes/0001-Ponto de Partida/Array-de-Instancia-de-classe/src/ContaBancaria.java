public class ContaBancaria {
  protected String nomeCorrentista;
  protected double saldo;

  // Construtor
  ContaBancaria(String nome){
    nomeCorrentista = nome;
  }

  // Construtor com outra assinatura
  ContaBancaria(String nome, double saldo){
    nomeCorrentista = nome;
    this.saldo = saldo;
  }

  /**
   * @return the saldo
   */

  public double getSaldo(){
    return saldo;
  }

  public void depositar(double valor){
    saldo += valor;
  }

  public boolean sacar (double valor){
    if (valor <= saldo){
      saldo -= valor;
      return true;
    }
    return false;
  }

  public String toString(){
    return "Nome: " + nomeCorrentista + "\tSaldo :" + saldo + "\n";
  }
}

