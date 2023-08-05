package projabb;

public class Node {

    int elemento;  // elemento armazenado no nó
    Node left, right, parent; // apontadores do nó

    Node(int elemento) {
        this.elemento = elemento;
        left = right = parent = null;
    }

    public void mostraNo(){
        System.out.print(elemento + " ");
    }   
}
