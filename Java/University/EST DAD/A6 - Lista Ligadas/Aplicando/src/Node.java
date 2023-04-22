public class Node {
    int numero;	// elemento armazenado no nó
    Node next;	// próximo elemento da lista... que também é do tipo Node

    public Node(int numero) {
        // construtor	
        this.numero = numero;
        next = null;
    }
    
    public void mostraAnimal(){
        System.out.println("Número: " + numero);
    }
}
