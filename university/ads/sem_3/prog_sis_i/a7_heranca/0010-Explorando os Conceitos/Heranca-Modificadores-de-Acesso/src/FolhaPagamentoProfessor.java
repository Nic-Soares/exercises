public class FolhaPagamentoProfessor {
  public static void main(String[] args) {
    Horista prof1 = new Horista("Ana de Souza", "108845", 35, 30, 84.30);
    prof1.calculaSalario();
    System.out.println(prof1.toString());
    Integral prof2 = new Integral ("Gustavo Braga", "154879", 42, 5000.00);
    prof2.setSalario();
    System.out.println(prof2.toString());

  }
}
