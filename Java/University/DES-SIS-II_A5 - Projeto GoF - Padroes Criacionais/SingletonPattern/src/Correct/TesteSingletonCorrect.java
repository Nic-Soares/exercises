package Correct;

public class TesteSingletonCorrect {
  public static void main(String[] args) {
    // obtém a instância única da classe Superpadrãozinho
    Superpadrãozinho instancia1 = Superpadrãozinho.getInstance();
    System.out.println("Instância 1: " + instancia1);

    // tenta obter outra instância da classe
    Superpadrãozinho instancia2 = Superpadrãozinho.getInstance();
    System.out.println("Instância 2: " + instancia2);

    // verifica se as duas instâncias são iguais
    if (instancia1 == instancia2) {
      System.out.println("As duas instâncias são iguais.");
    } else {
      System.out.println("As duas instâncias são diferentes.");
    }
  }
}

