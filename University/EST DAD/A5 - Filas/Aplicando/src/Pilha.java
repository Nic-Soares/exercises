public class Pilha extends Vetor {

    Pilha(int tamanho) {
        super(tamanho);
    }

    public void push(String valor) throws Exception {
        add(qtde, valor);
    }

    public String pop() throws Exception {
        String valor = get(qtde - 1);
        remove(qtde - 1);
        return valor;
    }

    public String top() throws Exception {
        return get(qtde - 1);
    }

}