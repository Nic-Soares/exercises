package Done;

class Matricula {
  private int codigo;
  private boolean bolsista;
  private double mensalidade, desconto;
  private Curso curso;

  Matricula(int codigo, boolean bolsista, double mensalidade, double desconto, Curso curso) {
    this.codigo = codigo;
    this.bolsista = bolsista;
    this.mensalidade = mensalidade;
    this.desconto = desconto;
    this.curso = curso;
  }

  public int getCodigo() {
    return codigo;
  }

  public boolean isBolsista() {
    return bolsista;
  }

  public double getDesconto() {
    return desconto;
  }

  public Curso getCurso(){
    return curso;
  }

  //Verifica se o Aluno é bolsista e aplica o desconto sob a mensalidade.
  public double getMensalidade() {
    if (bolsista){
      return getMensalidadeComDesconto();
    }
    return mensalidade;
  }

  public double getMensalidadeComDesconto() {
    return this.mensalidade - (desconto / 100) * mensalidade;
  }
}


