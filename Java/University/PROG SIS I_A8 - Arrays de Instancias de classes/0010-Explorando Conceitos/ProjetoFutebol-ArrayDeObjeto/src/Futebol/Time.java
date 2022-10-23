package Futebol;

public class Time {
  private String nome;
    Estadio [] estadio;
    int qtdeEstadio;

    Time(String nome){
      this.nome = nome;
      estadio = new Estadio [3];
    }

    boolean criarEstadio(String nome, int capacidade, int ano){
      if (qtdeEstadio < estadio.length){
        estadio[qtdeEstadio] = new Estadio(nome, capacidade, ano);
        qtdeEstadio++;
        return true;
      }
      else
        return false;
    }

    void getInfoEstadios(){
      System.out.println("Nome dos estadio que o time pode jogar");
      for (int i = 0; i < qtdeEstadio; i++)
        System.out.println(estadio[i].getNome() + "\t" + estadio[i].getCapacidade() + "\t" + estadio[i].getAnoInaguracao() + "\n");
    }

    public String getNome() {
      return nome;
    }
}
