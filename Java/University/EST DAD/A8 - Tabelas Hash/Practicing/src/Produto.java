public class Produto {
    private String codigo;
    private String descricao;
    private double preco;

    public Produto(String codigo, String descricao, double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
