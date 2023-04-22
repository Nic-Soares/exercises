package Done;

public class Trabalho{
  private String titulo, orientador;
  private double nota;
  private Banca banca;


  Trabalho(String titulo, String orientador, double nota, Banca banca){
    this.titulo = titulo;
    this.orientador = orientador;
    this.nota = nota;
    this.banca = banca;
  }


  public String getTitulo() {
    return titulo;
  }

  public String getOrientador() {
    return orientador;
  }

  public double getNota() {
    return nota;
  }

  public Banca getBanca(){
    return banca;
  }


}

