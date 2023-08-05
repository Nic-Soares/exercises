package projarvore;

public class Node {
    String nomePasta;  // elemento armazenado no nó
    Node left, right, parent; // apontadores do nó

    public Node(String nomePasta) {
        this.nomePasta = nomePasta;
        left = right = parent = null;        
    } 

    public void mostraNo(){
        System.out.print(nomePasta + " - ");
    }
}
