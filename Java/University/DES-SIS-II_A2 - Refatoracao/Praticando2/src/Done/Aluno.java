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
    String dados = "Aluno: " + nome + "\nCurso: " + matricula.getCurso().getInfoCurso() + "\n";

    if (matricula.isBolsista()) {
      dados += "Bolsista com desconto de: " + matricula.getDesconto() + "%\n";
      dados += "Mensalidade: R$ " + df.format(matricula.getMensalidadeComDesconto()) + "\n";
    } else {
      dados += "Mensalidade: R$ " + df.format(matricula.getMensalidade()) + "\n";
    }

    if (matricula.getCurso().isFinalizado()){
      dados += "Curso finalizado em " + getMatricula().getCurso().getAnoConclusao() + "\n";
    }

    Trabalho trabalho = matricula.getCurso().getTrabalho();
    if (trabalho != null) {
      dados += trabalho.getInfoTrabalho() + "\n";
    }

    return dados;
  }
}
