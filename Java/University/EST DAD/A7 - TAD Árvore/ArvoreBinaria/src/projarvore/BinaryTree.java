package projarvore;

public class BinaryTree {
    Node root; // raiz da árvore

    BinaryTree() {
        // Cria uma árvore binária vazia  
        root = null;        
    }

    public boolean isEmpty() {
        // Verifica se a árvore está vazia    
        if (root == null)
            return true;
        else
            return false;
    }

    public void addRoot(Node novo) throws Exception {
        // Adiciona uma raiz para a árvore, caso ela ainda não tenha    
        if (root != null) {
            throw new Exception("Árvore já tem raiz");
        }
        root = novo;        
    }

    public Node root() {
        // Devolve a raiz da árvore
        return root;
    }

    public boolean isInternal(Node n) {
        // Verifica se um nó n enviado como parâmetro é um nó interno  
        if (n.left!= null || n.right!= null)
            return true;
        else
            return false;
    }

    public boolean isLeaf(Node n) {
        // Verifica se um nó n enviado como parâmetro é uma folha
        if (n.left == null && n.right == null)
            return true;
        else
            return false;
    }

    public void addLeft(Node m, Node novo) throws Exception {
        // Adiciona um nó novo como filho m a esquerda 
        if (hasLeft(m)) {
            throw new Exception("Esse nó já tem filho Esquerdo");
        }
        m.left = novo;
        novo.parent = m;        
    }

    public Node left(Node n) throws Exception {
        // Devolve o filho da esquerda de um nó n  
        if (!hasLeft(n)) {
            throw new Exception("Esse nó não tem filho Esquerdo");
        }
        return n.left;
    }

    public boolean hasLeft(Node n) {
        // Verifica se um nó n enviado como parâmetro tem filho à esquerda    
        if (n.left != null)
            return true;
        else
            return false;
    }

    public void addRight(Node m, Node novo) throws Exception {
        // Adiciona o nó novo como filho da direita do nó m
        if (hasRight(m)) {
            throw new Exception("Esse nó já tem filho Direito");
        }
        m.right=novo;
        novo.parent=m;        
    }

    public Node right(Node n) throws Exception {
        // Devolve o filho da direita de um nó n enviado como parâmetro
        if (!hasRight(n)) {
            throw new Exception("Esse nó não tem filho Direito");
        }
        return n.right;
    }

    public boolean hasRight(Node n) {
        // Verifica se um nó n tem filho na direita 
        if (n.right != null)
            return true;
        else
            return false;
    }

    public void remove(Node n) {
        // Remove um nó n e todos os seus descendentes da árvore    
        if (n == root) {
            root = null;            
        } else {
            if (n.parent.left == n) {
                n.parent.left=null;
            } else if (n.parent.right == n) {
                n.parent.right = null;
            }
        }
    }

    public void executaPreOrdem(Node no) {
        if (no == null) {
            return;
        }
        no.mostraNo();
        executaPreOrdem(no.left);
        executaPreOrdem(no.right);
    }

    public void executaInOrdem(Node no) {
        if (no == null) {
            return;
        }
        executaInOrdem(no.left);
        no.mostraNo();
        executaInOrdem(no.right);
    }

    public void executaPosOrdem(Node no) {
        if (no == null) {
            return;
        }
        executaPosOrdem(no.left);
        executaPosOrdem(no.right);
        no.mostraNo();
    }
}
