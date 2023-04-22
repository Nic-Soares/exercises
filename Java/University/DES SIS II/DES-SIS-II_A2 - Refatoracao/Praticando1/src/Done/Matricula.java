package Done;
class Matricula {
  private String nomeCurso;
  private String nivelCurso;
  private int codigoMatricula;
  private boolean ehBolsista;
  private double mensalidadeCurso;
  private double desconto;

  public Matricula(String nomeCurso, String nivelCurso, int codigoMatricula, boolean ehBolsista, double mensalidadeCurso, double desconto) {
    this.nomeCurso = nomeCurso;
    this.nivelCurso = nivelCurso;
    this.codigoMatricula = codigoMatricula;
    this.ehBolsista = ehBolsista;
    this.mensalidadeCurso = mensalidadeCurso;
    this.desconto = desconto;
  }

  public String getNomeCurso() {
    return this.nomeCurso;
  }

  public String getNivelCurso() {
    return this.nivelCurso;
  }

  public int getCodigoMatricula() {
    return this.codigoMatricula;
  }

  public boolean isEhBolsista() {
    return this.ehBolsista;
  }

  public double getMensalidadeCurso() {
    return this.mensalidadeCurso;
  }

  public double getDesconto() {
    return this.desconto;
  }

  public double getMensalidadeCursoComDesconto() {
    return this.mensalidadeCurso * (1 - this.desconto / 100);
  }
}