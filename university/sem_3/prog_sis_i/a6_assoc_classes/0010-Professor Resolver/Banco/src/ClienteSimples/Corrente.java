package ClienteSimples;

public class Corrente {
  int numero;
  double saldo;
  double credito;

  public void  calculaCredito(){
    if (saldo<=10000) {
      credito = saldo * 0.05;
    }
    else if (saldo<=50000) {
      credito = saldo * 0.06;
    }
    else {
      credito = saldo * 0.07;
    }
  }

  public void sacar (double valor){
    if (saldo + credito >= valor)
      saldo-=valor;
    else
      System.out.println("Saldo insuficiente para saque");
  }

  public void depositar(double valor){
    saldo+=valor;
  }
}
