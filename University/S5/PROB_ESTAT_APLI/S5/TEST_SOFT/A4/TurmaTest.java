import org.junit.Before;
import org.junit.Test;

public class TurmaTest {
  final String nome = "07X";
  final String periodo = "Manhã";
  final int capacidade = 35;

  private Turma turma;
  private Disciplina disciplina;

  @Before
  public void init() {
    disciplina = new Disciplina("Testes de Software", 5, 80);
    turma = new Turma(disciplina, nome, periodo, capacidade);
  }

  @Test public void criarUmaNovaTurmaTest() {
    assertEquals(disciplina, turma.getDisciplina());
    assertEquals(nome, turma.getNome());
    assertEquals(periodo, turma.getPeriodo());
    assertEquals(capacidade, turma.getCapacidade());
    assertEquals(0, turma.getQuantidade());
  }

  @Test public void matricularUmAlunoTest() {
    Aluno aluno = new Aluno("Calebe de Paula Bianchini", 1234567);
    turma.marticular(aluno);
    assertEquals(1, turma.getQuantidade());
    assertEquals(aluno, turma.getAlunos().iterator().next());
  }

  @Test(expected = EstouroDeCapacidadeException.class) public void tentarUltrapassarCapacidadeDaTurmaTest() {
    for (int i = 0; i < turma.getCapacidade(); ++i) {
      turma.marticular(new Aluno("Aluno " + i, i));
    }
    Aluno aluno = new Aluno("Calebe de Paula Bianchini", 1234567);
    turma.marticular(aluno);
  }

  @Test(expected = TurmaCanceladaException.class)
  public void tentarMatricularEmTurmaCancelada() {
    turma.cancelar();
    Aluno aluno = new Aluno("Calebe de Paula Bianchini", 1234567);
    turma.marticular(aluno);
  }
}
