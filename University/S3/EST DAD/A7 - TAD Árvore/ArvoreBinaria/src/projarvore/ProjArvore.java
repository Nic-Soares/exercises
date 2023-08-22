package projarvore;

public class ProjArvore {

    public static void main(String[] args) throws Exception {
        BinaryTree diretorios = new BinaryTree();
        Node n0 = new Node("RAIZ");
        diretorios.addRoot(n0);
        Node n1 = new Node("MACKENZIE");
        diretorios.addLeft(n0, n1);
        Node n2 = new Node("PESSOAL");
        diretorios.addRight(n0, n2);
        Node n3 = new Node("TRABALHOS");
        diretorios.addLeft(n1, n3);
        Node n4 = new Node("PROGRAMAS");
        diretorios.addRight(n1, n4);
        Node n5 = new Node("LPII");
        diretorios.addLeft(n4, n5);
        Node n6 = new Node("ESTRUTURA");
        diretorios.addRight(n4, n6);
        
        Node no = diretorios.root();
        System.out.println("Raiz da árvore:" + diretorios.root().nomePasta);
        
        System.out.println("\n\nPercurso InOrdem - ERD");
        diretorios.executaInOrdem(no);
        
        System.out.println("\n\nPercurso Pré-Ordem - RED");
        diretorios.executaPreOrdem(no);
        
        System.out.println("\n\nPercurso Pós-Ordem - EDR");
        diretorios.executaPosOrdem(no);     
    }
}
