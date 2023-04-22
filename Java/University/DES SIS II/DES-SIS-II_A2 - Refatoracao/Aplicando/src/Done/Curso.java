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

  public Trabalho getTrabalho(){
    return trabalho;
  }

  public String getInfoConclusao() {
    if (finalizado) {
      String anoConclusao = String.format("Curso finalizado em %d", getAnoConclusao());
      return anoConclusao;
    }
    return "Curso em andamento";
  }



  public String getInfoTrabalho(String tipo){
    if (temTrabalho) {
      if (tipo.equals("trabalho")) {
        String nivel = getNivel();
        switch (nivel)
        {
          case "Graduação":
            nivel = "TCC";
            break;
          case "Lato sensu":
            nivel = "monografia: ";
            break;
          case "Mestrado":
            nivel = "dissertação: ";
            break;
          case "Doutorado":
            nivel = "tese: ";
            break;
          default:
            return "";
        }
        return String.format("Título da %s: %s\nOrientador: Prof. %s", nivel, trabalho.getTitulo(), trabalho.getOrientador());
      }
    }
    return "";
  }

}


