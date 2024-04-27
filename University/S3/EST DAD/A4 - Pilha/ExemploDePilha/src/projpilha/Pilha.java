package projpilha;

public class Pilha extends Vetor {

    int top;	 // indica em qual posição do vetor está o topo da pilha

    public Pilha(int capacity) {
        // Cria uma pilha com uma capacidade inicial
        super(capacity);
        top = -1;
    }

    public int size() {
        // Devolve o número de elementos da pilha
        return super.size();
    }

    public void push(String n) throws Exception {
        // Empilha, caso a pilha não esteja cheia, o elemento n
        top++;
        add(top, n);
    }

    public void pop() throws Exception {
        // Desempilha, caso a pilha não esteja vazia, o elemento do topo
        remove(top);
        top--;
    }

    public String top() throws Exception {
        // Devolve (não desempilha) o elemento do topo da pilha
        return get(top);
    }

}