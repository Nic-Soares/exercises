package Praticing;

import Praticing.CriacaoPersonagem.AvatarMasculino;
import Praticing.CriacaoPersonagem.Personagem;
import Praticing.CriacaoPersonagem.Superpadrãozinho;
import Praticing.FuncionamentoCinto.*;

public class TestaBridgeAndDecorator {
  public static void main(String[] args) {
    // criando um Superpadrãozinho sem avatar
    Personagem personagem = new Superpadrãozinho();

    // criando um cinto mágico
    Cinto cinto = new CintoMagico();

    // adicionando utilidades ao cinto
    cinto = new Corda(cinto);
    cinto = new BoteInflavel(cinto);
    cinto = new Paraquedas(cinto);
    cinto = new SprayPimenta(cinto);

    // utilizando o cinto com as utilidades adicionadas
    cinto.usar();

    // definindo um avatar masculino para o Superpadrãozinho
    personagem.setAvatar(new AvatarMasculino());

    // apresentando o Superpadrãozinho com o avatar masculino e o cinto com as utilidades adicionadas
    personagem.apresentar();
  }
}

