package projfila;

public class Fila extends Vetor {
    int inicio;
    int fim;
    
    public Fila(int capacity) {        
        super(capacity);
        inicio = 0;
        fim = -1;
    }

    public int size() {
    // Devolve o número de elementos da fila
        return super.size();
    }

    public void enqueue(String n) throws Exception {
    // Enfileira, caso a fila não esteja cheia, o elemento n
        if (fim == tamanho-1){
            fim = 0;
        }
        else{
            fim++;
        }
        add (fim,n);
    }

    public void dequeue() throws Exception {
    // Desenfileira, caso a fila não esteja vazia, o primeiro elemento
        remove(inicio);
        if (inicio == tamanho-1){
            inicio = 0;
        }
        else{
            inicio++;
        }
        
    }

    public String front() throws Exception{
	// Devolve, sem desenfileirar, o primeiro elemento da fila
        return get(inicio);
    }    
}
