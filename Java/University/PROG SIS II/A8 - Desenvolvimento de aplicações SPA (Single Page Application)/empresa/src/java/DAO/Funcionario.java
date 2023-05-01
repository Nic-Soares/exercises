package DAO;

public class Funcionario {
    private int numat;
    private String nome;
    private double salario;
    private char sexo;
    private Integer ndepto;
    private int nsuper;

    // Construtor vazio
    public Funcionario() {

    }

    // Construtor com argumentos
    public Funcionario(int numat, String nome, double salario, char sexo, Integer ndepto, int nsuper) {
        this.numat = numat;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
        this.ndepto = ndepto;
        this.nsuper = nsuper;
    }

    // Getters e setters
    public int getNumat() {
        return numat;
    }

    public void setNumat(int numat) {
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Integer getNdepto() {
        return ndepto;
    }

    public void setNdepto(Integer ndepto) {
        this.ndepto = ndepto;
    }

    public int getNsuper() {
        return nsuper;
    }

    public void setNsuper(int nsuper) {
        this.nsuper = nsuper;
    }
}
