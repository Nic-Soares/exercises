package Done;

public class Testa2 {
  public static void main(String[] args) {

    Professor professor1 = new Professor("Grady Booch");
    Professor professor2 = new Professor("Erich Gamma");
    Professor professor3 = new Professor("Albert Einstein");
    Professor professor4 = new Professor("Diógenes, o Cínico");

    Curso curso1 = new Curso("ADS", "Graduacao", false, false, 2020, null);
    Matricula matricula1 = new Matricula(123456, true, 920.50, 20.5, curso1);
    Aluno aluno1 = new Aluno("Martin Fowler", matricula1);

    Banca banca2 = new Banca(professor1, professor2);
    Trabalho trabalho2 = new Trabalho("Impacto da Refatoração", "Peter Coad",  0, banca2);
    Curso curso2 = new Curso("Computação Aplicada", "Lato sensu", true, true, 2019, trabalho2);
    Matricula matricula2 = new Matricula(654321, false, 2150.45, 0, curso2);
    Aluno aluno2 = new Aluno("Kent Beck", matricula2);

    System.out.println(aluno1.getInformacao());
    System.out.println(aluno2.getInformacao());
  }
}
