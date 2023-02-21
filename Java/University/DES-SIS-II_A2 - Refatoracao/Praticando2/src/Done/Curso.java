package Done;

public class Curso {
  private String nome, nivel;
  private  boolean finalizado, temTrabalho;
  private int anoFinal;
  private Trabalho trabalho;

  public Curso(String nome, String nivel, boolean finalizado, boolean temTrabalho, int anoFinal, Trabalho trabalho) {
    this.nome = nome;
    this.nivel = nivel;
    this.finalizado = finalizado;
    this.temTrabalho = temTrabalho;
    this.anoFinal = anoFinal;
    this.trabalho = trabalho;
    if (temTrabalho) {
      this.trabalho = trabalho;
    } else {
      this.trabalho = null;
    }
  }

  public String getNivel() {
    return nivel;
  }

  public Trabalho getTrabalho() {
    return trabalho;
  }
}


