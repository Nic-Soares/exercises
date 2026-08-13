public class FolhaPagto {
  public static void main(String[] args) {
    Horista funcionario1 = new Horista("Joao", "da Silva", 111, 80, 40);
    funcionario1.calcSalario();
    System.out.println("\nDados do funcionário Horista");
    System.out.println(funcionario1.toString());

    Mensalista funcionario2 = new Mensalista("Maria", "de Souza", 222, 1000);
    funcionario2.calcSalario(0);
    System.out.println("\nDados do funcionário mensalista");
    System.out.println(funcionario2.toString());

    Mensalista funcionario3 = new Mensalista("Carlos", "de Lima", 333, 1000);
    funcionario3.calcSalario(2);
    System.out.println("\nDados do funcionário mensalista");
    System.out.println(funcionario3.toString());
  }
}
