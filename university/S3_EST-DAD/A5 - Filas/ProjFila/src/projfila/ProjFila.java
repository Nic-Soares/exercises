package projfila;

public class ProjFila {
    public static void main(String[] args) {

        // Cria uma nova instância da classe Fila com capacidade de 10 elementos
        Fila f1 = new Fila(10);

        try {
            // Adiciona três elementos na fila
            f1.enqueue("Marcos Paulo");
            f1.enqueue("Ana Luiza");
            f1.enqueue("José Almeida");

            // Exibe o primeiro elemento da fila (sem removê-lo)
            System.out.println("Primeiro da fila: " + f1.front());

            // Remove o primeiro elemento da fila
            f1.dequeue();

            // Adiciona um novo elemento na fila
            f1.enqueue("Julia Muniz");

            // Exibe o primeiro elemento da fila (que agora é "Ana Luiza")
            System.out.println("Primeiro da fila: " + f1.front());

            // Adiciona mais um elemento na fila
            f1.enqueue("Maria Marta");

            // Exibe o número de elementos na fila (que agora é 3)
            System.out.println("Pessoas na fila: " + f1.size());

        } catch (Exception e) {
            // Exibe a mensagem de erro, caso ocorra uma exceção
            System.out.println(e.getMessage());
        }
    }
}