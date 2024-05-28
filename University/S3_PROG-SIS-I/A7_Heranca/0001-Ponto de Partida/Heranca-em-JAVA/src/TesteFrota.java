public class TesteFrota {
  public static void main(String[] args) {
    Carro meuCarro = new Carro();
    meuCarro.qtdePortas = 4;
    meuCarro.renavam = 1809358684;
    meuCarro.proprietario = "Jorge";
    meuCarro.transfereProprietario("Renato");
    System.out.println(meuCarro.toString());

    Caminhao meuCaminhao = new Caminhao();
    meuCaminhao.proprietario = "Pedro";
    meuCaminhao.renavam = 1345678976;
    meuCaminhao.qtdeEixos = 3;
    System.out.println(meuCaminhao.toString());
  }
}
