package Correct;

public class Superpadrãozinho {
  private static Superpadrãozinho instancia; // variável estática privada que armazena a única instância da classe

  private Superpadrãozinho() {
    // construtor privado para evitar a criação de outras instâncias
  }

  public static Superpadrãozinho getInstance() {
    if (instancia == null) { // se a variável de instância ainda não foi inicializada
      instancia = new Superpadrãozinho(); // cria uma nova instância da classe
    }
    return instancia;
  }

  // métodos e atributos do personagem principal aqui...
}
