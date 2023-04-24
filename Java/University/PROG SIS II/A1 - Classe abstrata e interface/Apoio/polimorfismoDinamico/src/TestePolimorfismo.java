public class TestePolimorfismo {
  public static void main(String[] args) {
    Animal animal1 = new Cachorro();
    Animal animal2 = new Gato();

    animal1.fazerBarulho();
    animal2.fazerBarulho();
  }
}
