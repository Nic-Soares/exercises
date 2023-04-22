public class Ponto {
  private int x, y;
  public Ponto(int x, int y) {
    this.x = x;
    this.y = y;
  }
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Ponto)) {
      return false;
    }
    Ponto p = (Ponto) obj;
    return x == p.x && y == p.y;
  }
  public double distancia(Ponto p) {
    int xDiff = x - p.x;
    int yDiff = y - p.y;
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }
  @Override
  public String toString(){
    return "Ponto{" + " x=" + x + ", y=" + y + '}';
  }
}