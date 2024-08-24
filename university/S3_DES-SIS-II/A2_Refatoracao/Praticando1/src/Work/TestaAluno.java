package Work;

class TestaAluno
{
  public static void main (String args[])
  {
    Aluno a1 = new Aluno("Martin Fowler",
            "ADS",
            "Graduação",
            11223344,
            true,
            920.50,
            20.5);
    Aluno a2 = new Aluno("Kent Beck",
            "Computação Aplicada",
            "Mestrado",
            22334455,
            false,
            2150.45,
            0);
    System.out.println(a1.getDados());
    System.out.println(a2.getDados());
  }
}
