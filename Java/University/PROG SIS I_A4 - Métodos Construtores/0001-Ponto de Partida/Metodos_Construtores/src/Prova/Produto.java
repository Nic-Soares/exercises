package Prod;
public class Produto {
  String nome;
  double preco;
  int quantidade;

  Produto (String nome, double preco, int quantidade){
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;

  }

  public double calculaValor() {
    return (preco * quantidade);

  }
}
