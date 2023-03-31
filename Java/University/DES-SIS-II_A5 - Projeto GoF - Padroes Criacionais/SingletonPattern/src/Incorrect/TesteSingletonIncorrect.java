package Incorrect;

public class TesteSingletonIncorrect {
  public static void main(String[] args) {
    // tenta criar uma instância da classe Superpadrãozinho
    Superpadrãozinho instancia1 = new Superpadrãozinho();
    System.out.println("Instância 1: " + instancia1);

    // tenta criar outra instância da classe
    Superpadrãozinho instancia2 = new Superpadrãozinho();
    System.out.println("Instância 2: " + instancia2);

    // verifica se as duas instâncias são iguais
    if (instancia1 == instancia2) {
      System.out.println("As duas instâncias são iguais.");
    } else {
      System.out.println("As duas instâncias são diferentes.");
    }
  }
}


