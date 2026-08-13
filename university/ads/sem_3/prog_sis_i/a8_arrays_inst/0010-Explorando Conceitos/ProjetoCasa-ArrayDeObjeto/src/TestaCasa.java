public class TestaCasa {
  public static void main(String[] args) {
    Casa lar = new Casa();
    lar.pinta("azul");
    lar.porta[0].pinta("branco");
    lar.porta[0].altura = 3.0;
    lar.porta[0].largura = 1.10;
    lar.porta[0].fecha();
    lar.porta[1].pinta("bege");
    lar.porta[1].altura = 2.10;
    lar.porta[1].largura = 0.82;
    lar.porta[1].abre();
    lar.porta[2].pinta("preto");
    lar.porta[2].altura = 2.10;
    lar.porta[2].largura = 0.72;
    lar.porta[2].abre();

    System.out.println("Quantidade de portas abertas: " + lar.portasAbertas());
    System.out.println("Cor da casa: " + lar.cor);
    System.out.println("Cor da porta 1: " + lar.porta[0].cor);
    System.out.println("Largura da porta 1: " + lar.porta[0].largura);
    System.out.println("Altura da porta 1: " + lar.porta[0].altura);
    if (lar.porta[1].estaAberta()){
      System.out.println("Porta 2 esta aberta");
    }
    else {
      System.out.println("Porta 2 está fechado");
    }
  }
}
