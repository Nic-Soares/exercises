package Work;

class Testa
{
  public static void main (String args[])
  {
    String dados1 [] = {null,null,null};
    Aluno aluno1 = new Aluno("Martin Fowler",
            "ADS",
            "Graduação",
            11223344,
            true,
            false,
            false,
            -1,
            920.50,
            20.5,
            dados1);

    String dados2 [] = {"Peter Coad",
            "Impacto da Refatoração",
            null,
            "Grady Booch",
            "Erich Gamma"};
    Aluno aluno2 = new Aluno("Kent Beck",
            "Computação Aplicada",
            "Mestrado",
            22334455,
            false,
            true,
            true,
            2019,
            2150.45,
            0,
            dados2);
    System.out.println(aluno1.getDados());
    System.out.println(aluno2.getDados());
  }
}
