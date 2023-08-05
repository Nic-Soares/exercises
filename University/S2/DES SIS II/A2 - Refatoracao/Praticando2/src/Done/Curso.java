package Done;

public class Curso {
  private String nome, nivel;
  private  boolean finalizado, temTrabalho;
  private int anoConclusao;
  private Trabalho trabalho;

  Curso(String nome, String nivel, boolean finalizado, boolean temTrabalho, int anoConclusao, Trabalho trabalho) {
    this.nome = nome;
    this.nivel = nivel;
    this.finalizado = finalizado;
    this.temTrabalho = temTrabalho;
    this.anoConclusao = anoConclusao;
    this.trabalho = trabalho;

    if (temTrabalho) {
      trabalho.setTipo(nivel);
      this.trabalho = trabalho;
    }
  }

  public String getNome() {
    return nome;
  }

  public String getNivel() {
    return nivel;
  }

  public boolean isFinalizado() {
    return finalizado;
  }

  public boolean isTemTrabalho() {
    return temTrabalho;
  }

  public int getAnoConclusao() {
    return anoConclusao;
  }

  public Trabalho getTrabalho() {
    return trabalho;
  }

  public String getInfoCurso() {
    return nivel + " em " + nome;
  }
}


