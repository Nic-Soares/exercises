public class ProjListaLigada {
    public static void main(String[] args) {
        ListaLigada numeros = new ListaLigada();
        try {
            numeros.addFirst(new Node(1));
            numeros.addFirst(new Node(2));
            numeros.addLast(new Node(3));
            numeros.addLast(new Node(4));
            numeros.addFirst(new Node(5));
            numeros.addAfter(new Node(6), 1);
            numeros.addAfter(new Node(7), 4);
            numeros.addBefore(new Node(8), 5);
            numeros.addBefore(new Node(9), 7);
            numeros.addBefore(new Node(10), 3);
            numeros.mostraLista();
            System.out.println("Tamanho da lista: " + numeros.size());
            numeros.remove(8);
            numeros.mostraLista();
            System.out.println("Tamanho da lista: " + numeros.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

