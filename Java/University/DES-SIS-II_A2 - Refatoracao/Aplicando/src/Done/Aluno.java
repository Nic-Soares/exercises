package Done;
import java.text.DecimalFormat;

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
}