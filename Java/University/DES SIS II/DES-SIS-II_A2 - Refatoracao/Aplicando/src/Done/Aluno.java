package Done;

class Aluno {
  private String nome;
  private Matricula matricula;

  Aluno(String nome, Matricula matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }

  public String getNome() {
    String aluno = "Aluno: ";
    return aluno + nome;
  }

  public Matricula getMatricula() {
    return matricula;
  }

  public String getInformacao() {
    String informacao = getNome() + "\n";
    informacao += getInfoCurso("nome") + "\n";
    informacao += getInfoFinanceira() + "\n";
    informacao += getInfoCurso("conclusao");
    informacao += getInfoCurso("trabalho") + "\n";
    informacao += getInfoBanca();
    return informacao;
  }

  public String getInfoCurso(String info) {
    String conhecimentoCurso = matricula.getDadosCurso(info);
    return conhecimentoCurso;
  }

  public String getInfoFinanceira() {
    String conhecimentoFinanceiro = matricula.getInfoMatricula();
    return conhecimentoFinanceiro;
  }

  public String getInfoBanca(){
    String conhecimentoBanca = matricula.getDadosBanca();
    return conhecimentoBanca;
  }
}