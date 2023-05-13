package projdicionario;

public class Definicao {
    private String palavra;
    private String traducao;

    public Definicao(String palavra, String traducao) {
        this.palavra = palavra;
        this.traducao = traducao;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getTraducao() {
        return traducao;
    }

    public void setTraducao(String traducao) {
        this.traducao = traducao;
    }
}
