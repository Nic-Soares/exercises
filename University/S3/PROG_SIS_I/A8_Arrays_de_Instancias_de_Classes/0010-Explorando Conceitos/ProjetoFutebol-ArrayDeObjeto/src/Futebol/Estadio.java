package Futebol;

public class Estadio {
  private int anoInaguracao;
  private String nome;
  private int capacidade;

  Estadio(String n, int c, int ano){
    nome = n;
    capacidade = c;
    anoInaguracao = ano;
  }

  public int getAnoInaguracao(){
    return anoInaguracao;
  }

  public String getNome(){
    return nome;
  }

  public int getCapacidade(){
    return capacidade;
  }

}
