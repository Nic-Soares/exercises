
public class Fila extends Vetor {

    public Fila(int tamanho) {
        super(tamanho);
    }

    public void enqueue(String valor) throws Exception {
        add(qtde, valor);
    }

    public String dequeue() throws Exception {
        String valor = get(0);
        remove(0);
        return valor;
    }

    public String front() throws Exception{
        // Devolve, sem desenfileirar, o primeiro elemento da fila
        return get(0);
    }

}
