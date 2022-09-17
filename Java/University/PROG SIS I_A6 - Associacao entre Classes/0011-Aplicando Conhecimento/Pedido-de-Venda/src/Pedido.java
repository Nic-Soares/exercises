import java.util.Scanner;
public class Pedido {
  int numero;
  Produto item;
  int quantidade;
  double valor;

  Pedido (int numero, Produto item, int quantidade){
    this.numero = numero;
    this.item = item;
    this.quantidade = quantidade;
    this.valor = valor;
  }
  
  //Armazena no atributo valor o resultado do preço do produto multiplicado pela quantidade vendida
  public void calculaPedido() {valor = quantidade * item.preco;}

  public void toString(double valor) {
    System.out.println("Saldo insuficiente para saque");
  }
}
