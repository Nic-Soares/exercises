package Praticing.FuncionamentoCinto;

public class TestaDecorator {
  public static void main(String[] args) {
    Cinto cinto = new CintoMagico();

    cinto.usar(); // deve imprimir "Usando cinto mágico..."

    cinto = new Corda(cinto);
    cinto.usar(); // deve imprimir "Usando cinto mágico...Adicionando corda..."

    cinto = new Paraquedas(cinto);
    cinto.usar(); // deve imprimir "Usando cinto mágico...Adicionando corda...Adicionando paraquedas..."

    cinto = new BoteInflavel(cinto);
    cinto.usar(); // deve imprimir "Usando cinto mágico...Adicionando corda...Adicionando paraquedas...Adicionando bote inflável..."

    cinto = new SprayPimenta(cinto);
    cinto.usar(); // deve imprimir "Usando cinto mágico...Adicionando corda...Adicionando paraquedas...Adicionando bote inflável...Adicionando spray de pimenta..."
  }
}
