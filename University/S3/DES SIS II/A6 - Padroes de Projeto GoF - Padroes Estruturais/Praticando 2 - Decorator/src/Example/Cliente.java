package Example;

public class Cliente {
  public static void main(String[] args) {
    Bebida cafeComCreme = new Creme(new Cafe());
    Bebida cafeComLeite = new Leite(new Cafe());
    Bebida cafeComCremeELeite = new Creme(new Leite(new Cafe()));

    System.out.println(cafeComCreme.getDescricao() + ": R$ " + cafeComCreme.getCusto());
    System.out.println(cafeComLeite.getDescricao() + ": R$ " + cafeComLeite.getCusto());
    System.out.println(cafeComCremeELeite.getDescricao() + ": R$ " + cafeComCremeELeite.getCusto());
  }
}
