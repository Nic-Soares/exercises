public class ProdutoPerecivel extends Produto{
  int validade;

  ProdutoPerecivel(String nome, int quantidade, double preco, int validade){
    super(nome, quantidade, preco);
    this.validade = validade;
  }

  public void retiraEstoque(int qtde){
    if (validade>2)
      quantidade-=qtde;
    else
      quantidade = 0;
  }

  public void entraEstoque(int qtde){
    if (quantidade == 0)
      quantidade+=qtde;
  }

  @Override
  public String toString(){
    return super.toString() + "\n" + validade;
  }

}
