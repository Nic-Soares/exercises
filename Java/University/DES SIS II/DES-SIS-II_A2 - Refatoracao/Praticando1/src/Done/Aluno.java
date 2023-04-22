package Done;
public class Aluno {
  private String nome;
  private Matricula matricula;

  public Aluno(String nome, Matricula matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }

  public String getDados() {
    String resp = "Aluno: " + this.nome + "\n";
    resp += "Curso: " + this.matricula.getNivelCurso() + " em " + this.matricula.getNomeCurso() + "\n";
    if (this.matricula.isEhBolsista()) {
      resp += "Bolsista com desconto de: " + this.matricula.getDesconto() + "%\n";
      resp += "Mensalidade: R$ " + this.matricula.getMensalidadeCursoComDesconto();
    } else {
      resp += "Mensalidade: R$ " + this.matricula.getMensalidadeCurso();
    }
    return resp;
  }
}
