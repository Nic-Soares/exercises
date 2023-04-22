public class TestaCirculo {
  public static void main(String[] args) {
    Circulo c1 = new Circulo(0, 0, 5, "00FF00");
    Circulo c2 = new Circulo(11, 11, 5, "00FF00");
    System.out.println("Iguais =>" + c1.compare(c2));
    System.out.println("Area =>" + c1.Area());
    System.out.println("Perimetro =>" + c1.Perimetro());
    System.out.println("Interseccao =>" + c1.interseccao(c2));
  }
}
