public class Circulo extends FiguraGeometrica {
  private Ponto centro;
  private int raio;

  public Circulo(int x, int y, int raio, String cor){
    super(cor);
    this.centro = new Ponto(x, y);
    this.raio = raio;
  }

  public Ponto getCentro(){
    return centro;
  }

  public int getRaio(){
    return raio;
  }

  public void setCentro(Ponto centro){
    this.centro = centro;
  }

  public void setRaio(int raio){
    this.raio = raio;
  }

  @Override
  public boolean compare(FiguraGeometrica o){
    if(o instanceof Circulo){
      Circulo c = (Circulo) o;
      return this.centro.getX() == c.getCentro().getX() &&
              this.centro.getY() == c.getCentro().getY() &&
              this.raio == c.getRaio();
    }
    return false;
  }

  public double Area(){
    return Math.PI * Math.pow(this.raio, 2);
  }

  public double Perimetro(){
    return 2 * Math.PI * this.raio;
  }

  public boolean interseccao(Circulo c){
    double distCentros = Math.sqrt(Math.pow(this.centro.getX() - c.getCentro().getX(), 2) +
            Math.pow(this.centro.getY() - c.getCentro().getY(), 2));
    return distCentros < this.raio + c.getRaio();
  }
}


