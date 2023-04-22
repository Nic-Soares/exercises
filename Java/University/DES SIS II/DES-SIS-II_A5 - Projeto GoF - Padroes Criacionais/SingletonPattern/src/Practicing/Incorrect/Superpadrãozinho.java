package Practicing.Incorrect;

public class Superpadrãozinho {
  private Superpadrãozinho instancia;

  public Superpadrãozinho() {
    // construtor público
  }

  public Superpadrãozinho getInstance() {
    if (instancia == null) {
      instancia = new Superpadrãozinho();
    }
    return instancia;
  }

  // métodos e atributos da classe...
}
