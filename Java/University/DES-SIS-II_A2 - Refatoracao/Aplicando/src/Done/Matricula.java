package Done;
import java.text.DecimalFormat;

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

  public double getMensalidade() {
    return mensalidade;
  }

  public double getDesconto() {
    return desconto;
  }

  public double getMensalidadeComDesconto() {
    return this.mensalidade - (desconto / 100) * mensalidade;
  }

  public Curso getCurso(){
    return curso;
  }

  public String getInfoMatricula() {
    if (bolsista) {
      String desconto = String.format("Bolsista com desconto de: %.2f%%\n", getDesconto());
      String mensalidade = String.format("Mensalidade: R$ %.2f", getMensalidadeComDesconto());
      return desconto + mensalidade;
    }
    String mensalidade = String.format("Mensalidade: R$ %.2f", getMensalidade());
    return mensalidade;
  }
}


