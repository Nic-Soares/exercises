public class Retangulo {
  private double altura;
  private double largura;

  public double perimetro(){
    return (2*(altura+largura));
  }

  public double area(){
    return (altura*largura);
  }

  public void setAltura(double altura) {
     this.altura = altura;
  }

  public void setLargura(double largura) {
    this.largura = largura;
  }
}
