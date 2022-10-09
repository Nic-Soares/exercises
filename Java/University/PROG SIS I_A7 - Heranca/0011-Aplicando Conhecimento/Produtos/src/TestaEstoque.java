public class TestaEstoque {
  public class TesteEstoque {
    public static void main(String[] args) {
      System.out.println("Informações do primeiro produto");
      Produto cs11 = new Produto("Balde", 10, 27.50);
      cs11.entraEstoque(20);
      cs11.retiraEstoque(40);
      cs11.retiraEstoque(5);
      System.out.println(cs11.toString());
      System.out.println("Informações do primeiro produto");
      ProdutoPerecivel cs22 = new ProdutoPerecivel("Enlatado", 5, 43.40,1);
      cs22.retiraEstoque(10);
      System.out.println(cs22.toString());
      cs22.entraEstoque(20);
      System.out.println(cs22.toString());
    }
  }
}
