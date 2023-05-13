import java.util.Scanner;

public class TesteHash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Digite o tamanho da tabela hash: ");
//        int tamanho = scanner.nextInt();
//        scanner.nextLine(); // Limpar o buffer do teclado
        
        int tamanho = 10;

        TabelaHash tabelaHash = new TabelaHash(tamanho);

        int opcao;
        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Contar produtos por país");
            System.out.println("5 - Mostrar nome do país");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    tabelaHash.cadastrarProduto(scanner);
                    break;
                case 2:
                    System.out.print("Digite o código do produto a ser removido: ");
                    String codigoRemover = scanner.nextLine();
                    tabelaHash.removerProduto(codigoRemover);
                    System.out.println("Produto removido com sucesso!");
                    break;
                case 3:
                    System.out.print("Digite o código do produto a ser buscado: ");
                    String codigoBuscar = scanner.nextLine();
                    Produto produtoEncontrado = tabelaHash.buscarProduto(codigoBuscar);
                    if (produtoEncontrado != null) {
                        System.out.println("Produto encontrado:");
                        System.out.println(produtoEncontrado);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o país para contar os produtos: ");
                    String paisContar = scanner.nextLine();
                    int quantidadeProdutos = tabelaHash.contarProdutosPorPais(paisContar);
                    System.out.println("Quantidade de produtos do país: " + quantidadeProdutos);
                    break;
                case 5:
                    System.out.print("Digite o código para mostrar o nome do país: ");
                    String codigoPais = scanner.nextLine();
                    String nomePais = tabelaHash.mostrarNomePais(codigoPais);
                    System.out.println("Nome do país: " + nomePais);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
