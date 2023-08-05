import java.math.BigDecimal;

public class Funcionario {
    private Long numat;
    private String nome;
    private double salario;
    private String sexo;
    private Integer ndepto;
    private Long nsuper;

    // Construtor vazio
    public Funcionario() {

    }

    // Construtor com argumentos
    public Funcionario(Long numat, String nome, double salario, String sexo, Integer ndepto, Long nsuper) {
        this.numat = numat;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
        this.ndepto = ndepto;
        this.nsuper = nsuper;
    }

    // Getters e setters
    public Long getNumat() {
        return numat;
    }

    public void setNumat(Long numat) {
        this.numat = numat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getNdepto() {
        return ndepto;
    }

    public void setNdepto(Integer ndepto) {
        this.ndepto = ndepto;
    }

    public Long getNsuper() {
        return nsuper;
    }

    public void setNsuper(Long nsuper) {
        this.nsuper = nsuper;
    }
}
