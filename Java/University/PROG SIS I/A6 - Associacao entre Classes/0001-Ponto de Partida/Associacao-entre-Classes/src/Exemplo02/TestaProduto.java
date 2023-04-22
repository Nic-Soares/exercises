package Exemplo02;

public class TestaProduto {
  public static void main(String[] args) {
    Produto produto1 = new Produto(100, "Caderno", 25.00, 300, 1234, "Tilibra", "(011)33344-9090");
    System.out.println("Dados do fornecedor do " + produto1.descricao);
    System.out.println("Código: " + produto1.fornecedor.codigo +
                       "\nNome: " + produto1.fornecedor.nome +
                       "\nTelefone: " + produto1.fornecedor.telefone);
  }
}
