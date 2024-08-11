public class Porta {
  boolean aberta;
  String cor;
  double altura, largura;

  Porta(){
    aberta = false;
  }
  public void abre(){
    aberta = true;
  }
  public void fecha(){
    aberta = false;
  }
  public void pinta (String cor){
    this.cor = cor;
  }

  public boolean estaAberta(){
    if (aberta)
      return true;
    return false;
  }
}
