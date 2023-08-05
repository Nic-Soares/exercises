public class Banco {
  private String nome;
  private ContaBancaria [] contas; //Declaraçao do atributo (contas) que é um vetor do tipo ContaBancaria
  int numContas = 0;

  //Construtor que criar o vetor do tamanho de maxContas
  Banco (String nome, int maxContas){
    this.nome = nome;
    contas = new ContaBancaria[maxContas];
  }

  //Metodo que cada vez que ele for chamado faz uma relaçao de uma instancia a uma determinada posiçao desse vetor
  public boolean criarConta(String correntista, double saldoInicial){
    if (numContas < contas.length){
      contas[numContas] = new ContaBancaria(correntista, saldoInicial);

      numContas++;
      return true;
    }
    return false;
  }

  public double getSomaSaldos(){
    double soma = 0;
    for (int i = 0; i < numContas; i++){
      soma += contas[i].saldo;
    }
    return soma;
  }

  @Override
  public String toString(){
    StringBuilder texto = new StringBuilder();
    for (int i = 0; i < numContas; i++){
      texto.append(contas[i].toString());
    }
    return "Banco: " + nome + "\nNúmero de Contas: " + numContas + "\n" + texto;
  }
}
