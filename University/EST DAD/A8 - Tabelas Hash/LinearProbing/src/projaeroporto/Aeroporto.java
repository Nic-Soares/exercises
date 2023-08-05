package projaeroporto;

public class Aeroporto {
    private String codigo;
    private String cidade;

    public Aeroporto(String codigo, String cidade) {
        this.codigo = codigo;
        this.cidade = cidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }   
}
