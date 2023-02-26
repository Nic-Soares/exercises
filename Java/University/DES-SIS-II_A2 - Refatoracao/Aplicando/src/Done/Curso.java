package Done;

public class Curso {
  private String nome, nivel;
  private  boolean finalizado, temTrabalho;
  private int anoConclusao;
  private Trabalho trabalho;

  public Curso(String nome,String nivel, boolean finalizado, boolean temTrabalho, int anoConclusao, Trabalho trabalho) {
    this.nome = nome;
    this.nivel = nivel;
    this.finalizado = finalizado;
    this.temTrabalho = temTrabalho;
    this.anoConclusao = anoConclusao;
    this.trabalho = trabalho;
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

  public String getInfoNome() {
    String nome = String.format("Curso: %s em %s", getNivel(), getNome());
    return nome;
  }

  public String getInfoConclusao() {
    String anoConclusao = String.format("Curso finalizado em %d", getAnoConclusao());
    return anoConclusao;
  }

  public String getInfoTrabalho(String tipo){
    if (tipo.equals("trabalho")) {
      return String.format("Título da %s: %s",getNivel(),trabalho.getTitulo());
    } else if (tipo.equals("orientador")) {
      return "Orientador: Prof. " + trabalho.getOrientador();
    }
    return "";
  }

}


