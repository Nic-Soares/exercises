class Cachorro extends Animal1 {
  public Cachorro(String nome) {
    super(nome);
  }

  @Override
  public void emitirSom() {
    System.out.println("Au Au");
  }
}
