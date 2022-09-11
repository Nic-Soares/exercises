package ClienteSimples;

public class Cliente {
  String nome;
  String cpf;
  int agencia;
  Poupanca ctaPoupanca;
  Corrente ctaCorrente = new Corrente();

  Cliente (String nome, String cpf, int agencia){
    this.nome = nome;
    this.cpf = cpf;
    this.agencia = agencia;
  }

  public void abrirPoupanca(Poupanca conta){
    ctaPoupanca = conta;
  }
}
