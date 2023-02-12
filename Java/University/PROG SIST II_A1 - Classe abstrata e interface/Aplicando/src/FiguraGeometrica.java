public abstract class FiguraGeometrica {
  private  String cor;
  public FiguraGeometrica(String cor){
  this.cor = cor;
  }
  public String getCor(){
    return this.cor;
  }
  public void setCor(String cor){
    this.cor = cor;
  }

  public abstract boolean compare(FiguraGeometrica o);
}