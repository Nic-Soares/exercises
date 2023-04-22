package projfila;

public class ProjFila {
    public static void main(String[] args) {

        Fila f1 = new Fila(5);
        try {
            f1.enqueue("ANA");
            f1.enqueue("BÁRBARA");
            f1.enqueue("CAIO");            
            f1.dequeue();
            f1.enqueue("DENIS");
            f1.dequeue();            
            f1.enqueue("EDSON");
            f1.enqueue("FLAVIA");
            f1.enqueue("GISELE");            
            f1.dequeue();
            f1.dequeue();
            f1.dequeue();
            System.out.println("Primeiro da fila: " + f1.front());
            System.out.println(f1.vetor[f1.inicio]);
            System.out.println(f1.vetor[f1.fim]);
            System.out.println("Pessoas na fila: " + f1.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
