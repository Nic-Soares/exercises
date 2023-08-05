package Exemplo02;

public class Produto {
  int codigo;
  String descricao;
  double preco;
  int quantidade;
  Fornecedor fornecedor;

  Produto(int codigo, String descricao, double preco, int quantidade, int codidoFornecedor, String nome, String telefone){
    this.codigo = codigo;
    this.descricao = descricao;
    this.preco = preco;
    this.quantidade = quantidade;
    fornecedor = new Fornecedor(codigo,nome, telefone); // Ao instanciar o objeto Forncedor no construtor de classe Produto, é feita a implementaçao da composiçao.
  }
}
