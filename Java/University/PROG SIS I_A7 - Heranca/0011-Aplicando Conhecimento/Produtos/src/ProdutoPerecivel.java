public class ProdutoPerecivel extends Produto{
  int validade;

  ProdutoPerecivel(String nome, int quantidade, double preco, int validade){
    super(nome, quantidade, preco);
    this.validade = validade;
  }

  void retiraEstoque(int validade){

  }

  void entraEstoque(int qtde){

  }

  @Override
  public String toString(){
    return super.toString() + "\n";
  }

}
