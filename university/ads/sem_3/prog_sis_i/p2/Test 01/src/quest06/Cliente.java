package quest06;

public class Cliente {

  String cpf;
  String nome;
  double limiteCredito;


  Data data = new Data();

  Cliente(String cpf, String nome, double limiteCredito, Data data) {
    this.cpf = cpf;
    this.nome = nome;
    this.limiteCredito = limiteCredito;
    this.data = data;
  }

  String defineStatus() {

    if (limiteCredito <= 1000) {
      return "BRONZE";
    } else if (limiteCredito <= 5000) {
      return "PRATA";
    } else
      return "OURO";
  }
}
