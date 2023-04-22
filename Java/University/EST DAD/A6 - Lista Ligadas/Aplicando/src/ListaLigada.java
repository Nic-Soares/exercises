// Foi escolhido os Seguintes exercicios:
// 1. Escreva uma função que retorne o elemento central de uma lista ligada.
// 8. Escrever uma função que retorna uma lista ligada que contém valores duplicados de outra lista ligada recebida como parâmetro. Por exemplo, se a lista recebida como parâmetro tiver os valores (3 1 2), deverá ser gerada e retornada a seguinte lista (3 3 1 1 2 2).

public class ListaLigada {

    private Node header; // início da lista ligada
    private Node trailer; // fim da lista ligada
    private int size;    // quantidade de elementos na lista ligada

    public ListaLigada() {
        // construtor - cria uma lista vazia
        header = null;
        trailer = null;
        size = 0;
    }

    public int size() {
        // retorna o tamanho da lista	
        return size;
    }

    public boolean isEmpty() {
        // verifica se a lista está vazia
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Node first() {
        // retorna o Nó inicial da lista
        return header;
    }

    public Node last() {
        // retorna o nó final da lista
        return trailer;
    }

    public void addFirst(Node novoAnimal) {
        // adiciona um animal no início da Lista
        if (isEmpty()) {
            // a lista está vazia
            header = novoAnimal;
            trailer = novoAnimal;
        } else {
            // já existe pelo menos um animal na lista
            novoAnimal.next = header;
            header = novoAnimal;
        }
        size++;
    }

    public void addLast(Node novoAnimal) {
        // adiciona um animal no final da Lista
        if (isEmpty()) {
            // a lista está vazia
            header = novoAnimal;
            trailer = novoAnimal;
        } else {
            // já existe pelo menos um animal na lista
            trailer.next = novoAnimal;
            trailer = novoAnimal;
        }
        size++;
    }

//    public void mostraLista() {
//        //mostra todos os elementos da lista
//        Node aux = header;
//        header.mostraNumero();
//        while (aux.next != null) {
//            aux = aux.next;
//            aux.mostraNumero();
//        }
////        System.out.println("Fim da Lista!");
//    }

// Versao melhorada do método mostrarLista para melhor visualizaçao no console.
    public void mostrarLista(String texto) {
        System.out.print(texto);
        Node current = header;
        while (current != null) {
            System.out.print(current.numero);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void addAfter(Node novoAnimal, int pos) throws Exception {
        // adiciona o nó novoAnimal depois do animal indicado por pos
        if (isEmpty()) // se a lista estiver vazia
        {
            throw new Exception("Lista vazia!");
        } else {
            // verifica se a posição de inserção é o final da lista
            if (trailer.numero == pos) {
                addLast(novoAnimal);
            } else {
                // procura a posição de inserção
                Node aux;
                for (aux = header; aux.next != null; aux = aux.next) {
                    if (aux.numero == pos) {
                        novoAnimal.next = aux.next;
                        aux.next = novoAnimal;
                        size++;
                    }
                }
            }
        }
    }

    public void addBefore(Node novoAnimal, int pos) throws Exception {
        // adiciona o nó novoAnimal antes do animal indicado por pos
        if (isEmpty()) // se a lista estiver vazia
        {
            throw new Exception("Lista vazia!");
        } else {
            // verifica se a posição de inserção é o início da lista
            if (header.numero ==pos) {
                addFirst(novoAnimal);
            } else {
                // procura a posição de inserção
                Node aux, ant = null;
                for (aux = header; !(aux.numero == pos); aux = aux.next) {
                    ant = aux;
                }
                ant.next = novoAnimal;
                novoAnimal.next = aux;
                size++;
            }
        }
    }

    public void remove(int numeracao) throws Exception {
        // remove o animal indicado como parâmetro
        if (isEmpty()) // se a lista estiver vazia
        {
            throw new Exception("Lista vazia!");
        } else {
            // verifica se o animal a ser removido é o primeiro da lista
            if (header.numero == numeracao) {
                header = header.next;
            } else {
                // procura pelo animal que será removido
                Node aux, ant = null;
                for (aux = header; !(aux.numero == numeracao); aux = aux.next) {
                    ant = aux;
                }
                ant.next = aux.next;
            }
            size--;
        }
    }

    // Implementaçao do método solicitado do Exercicio 1
    //1. Escreva uma função que retorne o elemento central de uma lista ligada.
    public Node getCentralNode() throws Exception {
        // verifica se a lista está vazia
        if (isEmpty()) {
            throw new Exception("Lista vazia!");
        }
        // conta o número de nós da lista ligada
        int count = 0;
        Node aux;
        for (aux = header; aux != null; aux = aux.next) {
            count++;
        }
        // obtém o índice do elemento central
        int index = count / 2;
        // percorre a lista ligada e retorna o nó no índice central
        int i = 0;
        for (aux = header; aux != null; aux = aux.next) {
            if (i == index) {
                return aux;
            }
            i++;
        }
        // se não encontrou o nó central, lança uma exceção
        throw new Exception("Nó central não encontrado!");
    }

    // Implementaçao do método solicitado do Exercicio 8
    // 8. Escrever uma função que retorna uma lista ligada que contém valores duplicados de outra lista ligada recebida como parâmetro. Por exemplo, se a lista recebida como parâmetro tiver os valores (3 1 2), deverá ser gerada e retornada a seguinte lista (3 3 1 1 2 2).
    public ListaLigada duplicate() throws Exception {
        // verifica se a lista está vazia
        if (isEmpty()) {
            throw new Exception("Lista vazia!");
        }
        ListaLigada novaLista = new ListaLigada();
        Node aux;
        for (aux = header; aux != null; aux = aux.next) {
            Node novoNode1 = new Node(aux.numero);
            Node novoNode2 = new Node(aux.numero);
            novaLista.addLast(novoNode1);
            novaLista.addLast(novoNode2);
        }
        return novaLista;
    }
}
