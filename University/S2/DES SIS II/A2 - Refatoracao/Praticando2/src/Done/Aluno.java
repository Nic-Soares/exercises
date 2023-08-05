package Done;
import java.text.DecimalFormat;

class Aluno{
  private String nome;
  private Matricula matricula;

  Aluno(String nome, Matricula matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }

  public String getNome(){
    return nome;
  }

  public Matricula getMatricula() {
    return matricula;
  }

  public String getDados() {
    DecimalFormat df = new DecimalFormat("#.00");
    String dados = getInformacoesAluno() + getInformacoesMatricula(df) + getInformacoesCursoFinalizado() + getInformacoesTrabalho();

    return dados;
  }

  private String getInformacoesAluno() {
    String aluno = "Aluno: ";
    return aluno + nome;
  }

  private String getInformacoesMatricula(DecimalFormat df) {
    String curso = "\nCurso: ";
    String bolsistaComDesconto = "Bolsista com desconto de: ";
    String mensalidade = "Mensalidade: R$ ";
    String informacoes = curso + matricula.getCurso().getInfoCurso() + "\n";

    if (matricula.isBolsista()) {
      informacoes += bolsistaComDesconto + matricula.getDesconto() + "%\n";
      informacoes += mensalidade + df.format(matricula.getMensalidadeComDesconto()) + "\n";
    } else {
      informacoes += mensalidade + df.format(matricula.getMensalidade()) + "\n";
    }

    return informacoes;
  }

  private String getInformacoesCursoFinalizado() {
    String cursoFinalizado = "Curso finalizado em ";
    String informacoes = "";

    if (matricula.getCurso().isFinalizado()){
      informacoes += cursoFinalizado + getMatricula().getCurso().getAnoConclusao() + "\n";
    }

    return informacoes;
  }

  private String getInformacoesTrabalho() {
    Trabalho trabalho = matricula.getCurso().getTrabalho();
    String informacoes = "";

    if (trabalho != null) {
      informacoes += trabalho.getInfoTrabalho() + "\n";
    }

    return informacoes;
  }
}
