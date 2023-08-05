public class TesteProduto {
  public static void main(String[] args) {
    Produto prod1 = new Produto();
    prod1.codigo = 12345;
    prod1.descricao= "Produto de Teste 2";
    prod1.setPreco(0.50);
    prod1.setQuantidade(200);
    System.out.println(prod1.getPreco());
    System.out.println(prod1.getQuantidade());
    System.out.println(prod1.calculaValor());
  }
}
