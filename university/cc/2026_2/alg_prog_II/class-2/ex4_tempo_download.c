/*
(teoria 2, Exercício em sala)
Em sites de jogos, geralmente o tamanho dos jogos para download é dado
em GB (10^9 bytes) enquanto a velocidade da conexão do link de internet
é dado em Mbps (10^6 bits por segundo). Assim, baixar um jogo de 10GB
usando uma conexão de 100Mbps demora 800 segundos.
Desenvolva uma função com a assinatura:
    int tempo(float tamanhoGB, float conexaoMbps);
Esta função deverá devolver o tempo (em segundos) para baixar um jogo
de tamanhoGB usando uma conexão com velocidade conexaoMbps.
*/


#include <stdio.h>
#include <math.h>

int tempo (float sizeGB, float conectionMbps) {
  sizeGB = pow(10, 9) * sizeGB;
  conectionMbps = pow(10, 6) * conectionMbps;
  
  return (sizeGB * 8) / conectionMbps;
}

int main () {
  float sizeGB, connectionMbps;

  printf("Digite o tamanho do jogo: \n");
  scanf("%f", &sizeGB);

  printf("Digite a velocidade da internet: \n");
  scanf("%f", &connectionMbps);

  printf("O tempo sera: %ds \n", tempo(sizeGB, connectionMbps));
  
  return 0;
}