class Gato extends Animal1 {
  public Gato(String nome) {
    super(nome);
  }

  @Override
  public void emitirSom() {
    System.out.println("Miau");
  }
}