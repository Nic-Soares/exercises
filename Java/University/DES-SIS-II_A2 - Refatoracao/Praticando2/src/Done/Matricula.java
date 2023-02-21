package Done;

class Matricula {
  private int codigo;
  private boolean bolsista;
  private double mensalidade, desconto;
  private Curso curso;

  public Matricula(int codigo, boolean bolsista, double mensalidade, double desconto, Curso curso) {
    this.codigo = codigo;
    this.bolsista = bolsista;
    this.mensalidade = mensalidade;
    this.desconto = desconto;
    this.curso = curso;
  }

  public Curso getCurso(){
    return curso;
  }
}

