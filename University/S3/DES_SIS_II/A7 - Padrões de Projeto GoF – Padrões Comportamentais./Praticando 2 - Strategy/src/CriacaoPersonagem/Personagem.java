package CriacaoPersonagem;

import CriacaoPersonagem.Idade.FaixaEtaria;

public interface Personagem {
  void setAvatar(Avatar avatar);

  void setFaixaEtaria(FaixaEtaria faixaEtaria);

  void apresentar();
}
