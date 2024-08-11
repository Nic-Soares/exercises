public class Vetor {

    String[] vetor;
    int tamanho;
    int qtde;

    Vetor(int tamanho) {
        vetor = new String[tamanho];
        this.tamanho = tamanho;
        this.qtde = 0;
    }

    public boolean isEmpty() {
        if (qtde == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return qtde;
    }

    public String get(int pos) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista vazia - não há elemento para recuperar!");
        }

        if (pos < 0 || pos >= qtde) {
            throw new Exception("Índice da Lista é inválido!");
        }
        return (vetor[pos]);
    }

    public void set(int pos, String n) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista vazia - não há elemento para alterar!");
        }

        if (pos < 0 || pos >= qtde) {
            throw new Exception("Índice da Lista é inválido!");
        }
        vetor[pos] = n;
    }

    public void add(int pos, String n) throws Exception {
        if (qtde == tamanho) {
            throw new Exception("A Fila está cheia! Impossível inserir!");
        }
        if (pos < 0 || pos > qtde) {
            throw new Exception("Índice da Lista é inválido!");
        }
        for (int i = qtde; i > pos; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[pos] = n;
        qtde++;
    }

    public void remove(int pos) throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila vazia - não há elemento para remover!");
        }
        if (pos < 0 || pos >= qtde) {
            throw new Exception("Índice da Lista é inválido!");
        }
        for (int i = pos; i < qtde - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        qtde--;
    }

    public int search(String n) {
        for (int i = 0; i < qtde; i++) {
            if (vetor[i].equals(n)) {
                return i;
            }
        }
        return -1;
    }

    public String[] getArray() {
        return vetor;
    }

    public void duplica() {
        if (qtde == tamanho) {
            String[] B = new String[vetor.length * 2];
            for (int i = 0; i < vetor.length; i++) {
                B[i] = vetor[i];
            }
            vetor = B;
            tamanho = vetor.length;
        }
    }
}