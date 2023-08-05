public class Main {

    public static void main(String[] args) throws Exception {

        String[] nomes = {"Ana", "Bruno", "Carla", "Daniel", "Eduarda"};

        int tamanho = nomes.length;
        Pilha Pilha1;
        Pilha1 = new Pilha(tamanho);
        Fila Fila1;
        Fila1 = new Fila(tamanho);

        for (int i = 0; i < nomes.length; i++) {
            Fila1.enqueue(nomes[i]);
        }

        //mostra a fila antes da inversão
        System.out.print("Fila antes da inversão: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print(Fila1.front());
            Fila1.dequeue();
            if (i < nomes.length - 1) {
                System.out.print(", ");
            }
        }

        //preenche a fila novamente
        for (int i = 0; i < 5; i++) {
            Fila1.enqueue(nomes[i]);
        }

        System.out.println("\n" + Fila1.front() + " é a primeira\n");

        //tira da fila e coloca na pilha
        do {
            Pilha1.push(Fila1.front());
            Fila1.dequeue();
        } while (Fila1.size()!=0);

        //tira da pilha e volta para a fila
        do {
            Fila1.enqueue(Pilha1.top());
            Pilha1.pop();
        } while (Pilha1.size()!=0);

        //mostra a fila após a inversão
        System.out.print("Fila depois da inversão: ");
        for (int i = 0; i < tamanho; i++) {
            String elemento = Fila1.front();
            System.out.print(elemento);
            Fila1.dequeue();
            Fila1.enqueue(elemento);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n" + Fila1.front() + " é a primeira");
    }
}
