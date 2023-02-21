package Done;

public class Testa {
  public static void main(String[] args) {
    Curso curso = new Curso("Graduação em ADS", "Graduação", true, false, 2024, null);
    Matricula matricula = new Matricula(123456, true, 500.0, 50.0, curso);
    Aluno aluno = new Aluno("Martin Fowler", matricula);

    System.out.println("Aluno: " + aluno.getNome());
    System.out.println("Curso: " + aluno.getMatricula().getCurso());
  }
}
