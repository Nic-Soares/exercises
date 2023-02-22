package Done;

public class Trabalho {
  private String titulo, orientador, tipo;
  private double nota;

  Trabalho(String titulo, String orientador, double nota){
    this.titulo = titulo;
    this.orientador = orientador;
    this.nota = nota;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getOrientador() {
    return orientador;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String nivel) {
    switch (nivel) {
      case "Graduação":
        this.tipo = "TCC";
        break;
      case "Lato sensu":
        this.tipo = "Monografia";
        break;
      case "Mestrado":
        this.tipo = "Dissertação";
        break;
      case "Doutorado":
        this.tipo = "Tese";
        break;
      default:
        this.tipo = null;
        break;
    }
  }

  public double getNota() {
    return nota;
  }

  public String getInfoTrabalho() {
    return "Trabalho de " + tipo + ": " + titulo +
            "\nOrientador(a): Prof. " + orientador + "\nNota: " + nota;
  }

}

