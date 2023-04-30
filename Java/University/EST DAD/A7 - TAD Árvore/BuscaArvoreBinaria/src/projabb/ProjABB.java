package projabb;

public class ProjABB {

    public static void main(String[] args) {
        /* este código cria a seguinte ABB
                    12
                   /  \
                  7   15
                 /    / \
                4    14 20
               /
              1
        */
        
        ABB tree = new ABB();
        tree.insere(new Node(12));
        tree.insere(new Node(7));
        tree.insere(new Node(15));
        tree.insere(new Node(4));
        tree.insere(new Node(20));
        tree.insere(new Node(14));
        tree.insere(new Node(1));
        System.out.println("\nPercurso In-Ordem");
        tree.executaInOrdem(tree.root());
        System.out.println("\nPercurso Pré-Ordem");
        tree.executaPreOrdem(tree.root());
        System.out.println("\nPercurso Pós-Ordem");
        tree.executaPosOrdem(tree.root());
        Node aux = tree.busca(new Node(99));
        if (aux==null)
            System.out.println("\nNão existe o valor procurado na árvore");
        else
            System.out.println("\nO valor " + aux.elemento + " está na árvore");
        tree.delete(tree.root(), 1);
        System.out.println("\nPercurso In-Ordem");
        tree.executaInOrdem(tree.root());
        tree.delete(tree.root(), 7);
        System.out.println("\nPercurso In-Ordem");
        tree.executaInOrdem(tree.root());
        tree.delete(tree.root(), 15);
        System.out.println("\nPercurso In-Ordem");
        tree.executaInOrdem(tree.root());              
    }    
}
