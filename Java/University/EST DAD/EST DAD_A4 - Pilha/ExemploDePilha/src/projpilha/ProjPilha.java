package projpilha;

public class ProjPilha {

    public static void main(String[] args) {
        Pilha filmes = new Pilha(5);
        try {
            filmes.push("A vida é bela");
            filmes.push("Homem Aranha");
            filmes.push("Harry Potter");
            System.out.println("Filme do topo: " + filmes.top());
            filmes.pop();
            filmes.push("Nasce uma estrela");
            System.out.println("Filme do topo: " + filmes.top());
            filmes.push("Bohemian Rhapsody");
            System.out.println("Quantidade de filmes na pilha: " + filmes.size());            
        }
        catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }    
}
