package Produtos;
public class Produto {
  int codigo;
  String descricao;
  double preco;
  Produto(int cod){
    codigo = cod;
  }

  Produto (int codigo, String descricao){
    this.codigo=codigo;
    this.descricao=descricao;
  }

  public void atulizaPreco(double porcentagem) {
    preco = preco + preco*porcentagem/100;
  }

}
