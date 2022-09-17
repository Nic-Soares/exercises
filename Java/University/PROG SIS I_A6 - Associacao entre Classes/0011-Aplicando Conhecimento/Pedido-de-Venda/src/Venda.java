public class Venda {
  public static void main(String[] args) {
    Produto produto1 = new Produto(1234,"caderno",18.30);
    Pedido pedido1 = new Pedido(58763,produto1,500);
    pedido1.calculaPedido();
    System.out.println("Informações do Pedido");
//    System.out.println(pedido1.toString());
    System.out.println("Número do pedido: " + pedido1.numero);
    System.out.println("Código do Produto: " + produto1.cod);
    System.out.println("Descrição: " + produto1.descricao);
    System.out.println("Preço do Produto: " + produto1.preco);
    System.out.println("Quantidade: " + pedido1.quantidade);
    System.out.println("Valor total do pedido: " + pedido1.valor);
  }
}
