package Produtos;
public class TestaProduto {
  public static void main (String[] args){
    Produto p1 = new Produto(1234);
      System.out.printf("\nCódigo: %d \nDescriçao: %s \nPreço: %.2f",
                        p1.codigo, p1.descricao, p1.preco);
      System.out.println("");
      p1.descricao = "Camisa";
      p1.preco = 100.00;
      p1.atulizaPreco(5);
      System.out.printf("\nCódigo: %d \nDescriçao: %s \nPreço: %.2f",
                        p1.codigo, p1.descricao, p1.preco);
      System.out.println("");

    Produto p2 = new Produto(2345, "Calça");
      p2.preco = 200;
      p2.atulizaPreco(10);
      System.out.printf("\nCódigo: %d \nDescriçao: %s \nPreço: %.2f",
                        p2.codigo, p2.descricao, p2.preco);
  }
}
