package Formas;

public class Circulo {
  private double raio;

  Circulo (double raio){
    this.raio = raio;
  }
  double calcArea (){
    return (Math.PI * Math.pow(raio,2));
  }

  public double getRaio() {
    return raio;
  }
}
