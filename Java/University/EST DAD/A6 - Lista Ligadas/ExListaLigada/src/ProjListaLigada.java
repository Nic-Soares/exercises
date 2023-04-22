public class ProjListaLigada {
    public static void main(String[] args) {
        ListaLigada animais = new ListaLigada();
        try {
            animais.addFirst(new Node("GATO"));
            animais.addFirst(new Node("PATO"));
            animais.addLast(new Node("LEÃO"));
            animais.addLast(new Node("TIGRE"));
            animais.addFirst(new Node("GALINHA"));
            animais.addAfter(new Node("GIRAFA"), "GATO");
            animais.addAfter(new Node("VACA"), "TIGRE");
            animais.addBefore(new Node("RAPOSA"), "GALINHA");
            animais.addBefore(new Node("GAIVOTA"), "VACA");
            animais.addBefore(new Node("JACARÉ"), "LEÃO");
            animais.mostraLista();
            System.out.println("Tamanho da lista: " + animais.size());
            animais.remove("RAPOSA");
            animais.mostraLista();
            System.out.println("Tamanho da lista: " + animais.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

