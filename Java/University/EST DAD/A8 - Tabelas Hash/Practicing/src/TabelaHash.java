import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TabelaHash {
    private ArrayList<LinkedList<Produto>> tabela;
    private int tamanho;

    public TabelaHash(int tamanho) {
        if (tamanho <= 0) {
            throw new IllegalArgumentException("O tamanho deve ser maior que zero.");
        }
        this.tamanho = tamanho;
        tabela = new ArrayList<>(tamanho);
        for (int i = 0; i < tamanho; i++) {
            tabela.add(new LinkedList<>());
        }
    }

    private int calcularHash(String codigo) {
        String pais = codigo.substring(0, 3);
        return Math.abs(pais.hashCode() % tamanho);
    }

    public void cadastrarProduto(Scanner scanner) {
        String codigo = lerCodigoProduto(scanner);
        String descricao = lerDescricaoProduto(scanner);
        double preco = lerPrecoProduto(scanner);

        Produto produto = new Produto(codigo, descricao, preco);
        adicionarProduto(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }

    private String lerCodigoProduto(Scanner scanner) {
        String codigo;
        boolean codigoValido = false;

        do {
            System.out.print("Digite o código do produto (13 dígitos): ");
            codigo = scanner.nextLine();

            if (codigo.length() != 13) {
                System.out.println("Erro: Código inválido. Deve conter 13 dígitos.");
            } else {
                codigoValido = true;
            }
        } while (!codigoValido);

        return codigo;
    }

    private String lerDescricaoProduto(Scanner scanner) {
        String descricao;
        boolean descricaoValida = false;

        do {
            System.out.print("Digite a descrição do produto: ");
            descricao = scanner.nextLine();

            if (descricao.trim().isEmpty()) {
                System.out.println("Erro: Descrição inválida. Não pode estar em branco.");
            } else {
                descricaoValida = true;
            }
        } while (!descricaoValida);

        return descricao;
    }

    private double lerPrecoProduto(Scanner scanner) {
        double preco = 0;
        boolean precoValido = false;

        do {
            System.out.print("Digite o preço do produto: ");
            String precoStr = scanner.nextLine();

            try {
                preco = Double.parseDouble(precoStr);

                if (preco <= 0) {
                    System.out.println("Erro: Preço inválido. Deve ser maior que zero.");
                } else {
                    precoValido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Preço inválido. Deve ser um número válido.");
            }
        } while (!precoValido);

        return preco;
    }


    private void adicionarProduto(Produto produto) { // Separate Chaining
        String codigo = produto.getCodigo();
        int indice = calcularHash(codigo);
        LinkedList<Produto> lista = tabela.get(indice);

        for (Produto p : lista) {
            if (p.getCodigo().equals(codigo)) {
                // Se o produto já existe na lista, atualiza seu preço
                p.setPreco(produto.getPreco());
                return;
            }
        }

        // Se o produto não existe na lista, adiciona-o
        lista.add(produto);
    }

    public void removerProduto(String codigo) {
        int indice = calcularHash(codigo);
        LinkedList<Produto> lista = tabela.get(indice);
        lista.removeIf(produto -> produto.getCodigo().equals(codigo));
    }

    public Produto buscarProduto(String codigo) {
        int indice = calcularHash(codigo);
        LinkedList<Produto> lista = tabela.get(indice);
        for (Produto produto : lista) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }

    public int contarProdutosPorPais(String pais) {
        int contador = 0;
        for (LinkedList<Produto> lista : tabela) {
            for (Produto produto : lista) {
                String codigo = produto.getCodigo();
                if (codigo.startsWith(pais)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public String mostrarNomePais(String codigo) {
        String pais = codigo.substring(0, 3);

        // Lógica fictícia para retornar um nome de país com base no código
        if (pais.equals("123")) {
            return "Brasil";
        } else if (pais.equals("456")) {
            return "Narnia";
        } else if (pais.equals("789")) {
            return "Grecia";
        } else {
            return "País Desconhecido";
        }
    }

}
