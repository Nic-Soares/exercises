// Foi escolhido os Seguintes exercicios:
// 1. Escreva uma função que retorne o elemento central de uma lista ligada.
// 8. Escrever uma função que retorna uma lista ligada que contém valores duplicados de outra lista ligada recebida como parâmetro. Por exemplo, se a lista recebida como parâmetro tiver os valores (3 1 2), deverá ser gerada e retornada a seguinte lista (3 3 1 1 2 2).

public class ProjListaLigada {
    public static void main(String[] args) {
        ListaLigada numeros = new ListaLigada();
        try {
            numeros.addFirst(new Node(1));
            numeros.addFirst(new Node(2));
            numeros.addLast(new Node(3));
            numeros.addLast(new Node(4));
            numeros.addFirst(new Node(5));
            numeros.addAfter(new Node(6), 1);
            numeros.addAfter(new Node(7), 4);
            numeros.addBefore(new Node(8), 5);
            numeros.addBefore(new Node(9), 7);
            numeros.addBefore(new Node(10), 3);

            numeros.mostrarLista("Lista: ");
            System.out.println("Tamanho da lista: " + numeros.size());
            Node central = numeros.getCentralNode();     // Implementaçao do método solicitado do Exercicio 1
            System.out.println("Elemento central: " + central.numero);     // Implementaçao do método solicitado do Exercicio 1


            numeros.remove(8);
            numeros.mostrarLista("\nLista sem o número '8': ");
            System.out.println("Tamanho da lista: " + numeros.size());
            System.out.println("Elemento central: " + central.numero);     // Implementaçao do método solicitado do Exercicio 1

            ListaLigada duplicada = numeros.duplicate();     // Implementaçao do método solicitado do Exercicio 8
            duplicada.mostrarLista("\nLista com seus valores duplicados: ");
            System.out.println("Tamanho da lista: " + duplicada.size());
            System.out.println("Elemento central: " + central.numero);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

