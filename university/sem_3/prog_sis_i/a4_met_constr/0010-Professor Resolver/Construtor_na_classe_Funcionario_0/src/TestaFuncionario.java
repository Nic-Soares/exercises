public class TestaFuncionario {
  public static void main(String[] args) {
    Funcionario func1 = new Funcionario("Carlos de Souza", 10000);
      System.out.println("Nome = " + func1.nome);
      System.out.println("Salário = " + func1.salario);
      System.out.println("Valor do imposto = " + func1.calculaImposto());
  }
}
