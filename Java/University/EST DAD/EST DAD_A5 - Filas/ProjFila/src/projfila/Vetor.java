package projfila;

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
            throw new Exception("Lista vazia - nÃ£o hÃ¡ elemento para recuperar!");
        }

        if (pos < 0 || pos >= qtde) {
            throw new Exception("Ãndice da Lista Ã© invÃ¡lido!");
        }
        return (vetor[pos]);
    }

    public void set(int pos, String n) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista vazia - nÃ£o hÃ¡ elemento para alterar!");
        }

        if (pos < 0 || pos >= qtde) {
            throw new Exception("Ãndice da Lista Ã© invÃ¡lido!");
        }
        vetor[pos] = n;
    }

    public void add(int pos, String n) throws Exception {
        if (qtde == tamanho) {
            throw new Exception("A Lista estÃ¡ cheia! ImpossÃ­Â­vel inserir!");
        }
        if (pos < 0 || pos > qtde) {
            throw new Exception("Ãndice da Lista Ã© invÃ¡lido!");
        }
        // abre espaÃƒÂ§o no vetor
        for (int j = qtde - 1; j >= pos; j--) {
            vetor[j + 1] = vetor[j];
        }
        vetor[pos] = n;
        qtde++;
    }

    public void remove(int pos) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista vazia - nÃ£o hÃ¡ elemento para remover!");
        }
        if (pos < 0 || pos >= qtde) {
            throw new Exception("Ãndice da Lista Ã© invÃ¡lido!");
        }
        // movimenta os elementos para a esquerda p/ cobrir posiÃƒÂ§ÃƒÂ£o vaga
        for (int j = pos; j <= qtde - 2; j++) {
            vetor[j] = vetor[j + 1];
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
        if (size() == tamanho) {
            String[] B = new String[vetor.length * 2];
            for (int i = 0; i < vetor.length; i++) {
                B[i] = vetor[i];
            }
            vetor = B;
        }
    }
}