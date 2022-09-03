public class TestaPessoa {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Allan", 30, (float)1.80);
    System.out.println("Nome: " + p1.getNome());
    System.out.println("Idade: " + p1.getIdade());
    System.out.println("Altura: " + p1.getAltura());
  }
}
