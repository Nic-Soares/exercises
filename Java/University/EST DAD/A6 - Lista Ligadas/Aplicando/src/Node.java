// Foi escolhido os Seguintes exercicios:
// 1. Escreva uma função que retorne o elemento central de uma lista ligada.
// 8. Escrever uma função que retorna uma lista ligada que contém valores duplicados de outra lista ligada recebida como parâmetro. Por exemplo, se a lista recebida como parâmetro tiver os valores (3 1 2), deverá ser gerada e retornada a seguinte lista (3 3 1 1 2 2).

public class Node {
    int numero;	// elemento armazenado no nó
    Node next;	// próximo elemento da lista... que também é do tipo Node

    public Node(int numero) {
        // construtor	
        this.numero = numero;
        next = null;
    }
    
    public void mostraNumero(){
        System.out.println("Número: " + numero);
    }

}
