package Formas;

public class Cilindro {
  private Circulo base;
  private double altura;

  Cilindro (double raio, double altura){
    base = new Circulo(raio);
    this.altura = altura;
  }

  double calcVolume(){
    return (altura*base.calcArea());
  }

  double calcArea(){
    return (2*(base.calcArea())+ 2*(Math.PI*base.getRaio()*altura));
  }
}
