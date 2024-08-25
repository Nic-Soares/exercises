import java.util.Scanner;
public class TestaRetangulo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Retangulo r1 = new Retangulo();
    System.out.println("Largura do retangulo:");
    double larg = input.nextDouble();
    r1.setLargura(larg);
    System.out.println("Altura do retangulo:");
    double alt = input.nextDouble();
    r1.setAltura(alt);
    System.out.println("Perimetro: " + r1.perimetro());
    System.out.println("Area: " + r1.area());
  }
}
