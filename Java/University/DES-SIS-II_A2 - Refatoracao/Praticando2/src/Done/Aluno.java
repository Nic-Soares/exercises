package Done;

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
}
