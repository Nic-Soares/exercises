package Formas;

public class TestaFormas {
  public static void main(String[] args) {
    double raio = 2;
    double altura = 5;
    Cilindro form1 = new Cilindro(raio, altura);
    System.out.println("Area do cilindro: " + form1.calcArea());
    System.out.println("Volume do cilindro: " + form1.calcVolume());
  }
}
