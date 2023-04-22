package projfila;

public class Fila extends Vetor {

    // Construtor da classe Fila que chama o construtor da classe Vetor
    public Fila(int capacity) {
        super(capacity);
    }

    // Método para obter o tamanho da fila
    public int size() {
        return super.size();
    }

    // Método para adicionar um elemento na fila
    public void enqueue(String n) throws Exception {
        // Chama o método add da classe Vetor passando o tamanho atual da fila como posição e o elemento a ser adicionado
        add (size(),n);
    }

    // Método para remover o primeiro elemento da fila
    public void dequeue() throws Exception {
        // Chama o método remove da classe Vetor passando a posição 0
        remove(0);
    }

    // Método para obter o primeiro elemento da fila sem removê-lo
    public String front() throws Exception{
        // Chama o método get da classe Vetor passando a posição 0
        return get(0);
    }
}

