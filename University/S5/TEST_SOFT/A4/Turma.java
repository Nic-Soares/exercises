import java.util.HashSet;
import java.util.Set;

public class Turma {
  private Disciplina disciplina;
  private String nome;
  private String periodo;
  private int capacidade;
  private int quantidade;
  private Set<Aluno> alunos;
  private boolean cancelada;

  public Turma(Disciplina disciplina, String nome, String periodo, int capacidade) {
    this.disciplina = disciplina;
    this.nome = nome;
    this.periodo = periodo;
    this.capacidade = capacidade;
    this.quantidade = 0;
    this.alunos = new HashSet<>();
    this.cancelada = false;
  }

  public Disciplina getDisciplina() {
    return disciplina;
  }

  public String getNome() {
    return nome;
  }

  public String getPeriodo() {
    return periodo;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public Set<Aluno> getAlunos() {
    return alunos;
  }

  public void matricular(Aluno aluno) {
    if (cancelada) {
      throw new TurmaCanceladaException();
    }

    if (quantidade < capacidade) {
      alunos.add(aluno);
      quantidade++;
    } else {
      throw new EstouroDeCapacidadeException();
    }
  }

  public void cancelar() {
    cancelada = true;
  }
}