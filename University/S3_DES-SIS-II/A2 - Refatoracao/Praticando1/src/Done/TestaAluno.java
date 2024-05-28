package Done;
class TestaAluno {
  public static void main (String args[]) {
    Matricula matricula1 = new Matricula("ADS", "Graduação", 11223344, true, 920.50, 20.5);
    Aluno a1 = new Aluno("Martin Fowler", matricula1);

    Matricula matricula2 = new Matricula("Computação Aplicada", "Mestrado", 22334455, false, 2150.45, 0);
    Aluno a2 = new Aluno("Kent Beck", matricula2);

    System.out.println(a1.getDados());
    System.out.println(a2.getDados());
  }
}
