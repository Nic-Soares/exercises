### EXEMPLO PRÁTICO



Vejamos um exemplo prático em uma aplicação que possui:

a) uma classe chamada ContaBancaria com os atributos nome do correntista e saldo.

Esta classe possui um construtor que recebe como parâmetro o nome do correntista e seu saldo inicial, métodos para efetuar saque e depósito na conta e o método toString() para retornar os dados dos atributos desta classe.

Veja a implementação da classe ContaBancaria:

```java
public class ContaBancaria {
  protected String nomeCorrentista;
  protected double saldo;

  // Construtor com outra assinatura
  ContaBancaria(String nome, double saldo){
    nomeCorrentista = nome;
    this.saldo = saldo;
  }

  /**
   * @return the saldo
   */

  public double getSaldo(){
    return saldo;
  }

  public void depositar(double valor){
    saldo += valor;
  }

  public boolean sacar (double valor){
    if (valor <= saldo){
      saldo -= valor;
      return true;
    }
    return false;
  }

  public String toString(){
    return "Nome: " + nomeCorrentista + "\tSaldo :" + saldo + "\n";
  }
}
```

b) uma classe chamada Banco que possui os atributos nome do Banco e um vetor para armazenar as contas bancárias dos clientes, além de um atributo para contar o número de contas que o banco possui.

Esta classe possui um método construtor que recebe, por parâmetro, o nome do Banco e o número máximo de contas que poderão ser criadas.

Possui, também, um método para criar conta bancária que é responsável por instanciar as contas bancárias e armazenar sua referência ao vetor de contas.

Além destes métodos, a classe terá um método para calcular a soma do saldo de todos os clientes e o método toString() para retornar os dados dos atributos desta classe.

Veja a implementação da classe Banco:

```java
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
```

Observe que o construtor, nas linhas 8 a 11, instanciará, na linha 10, o atributo contas como um *array* de objetos do tipo ContaBancaria, com capacidade de armazenar a quantidade de contas (maxContas) que será passada por parâmetro ao construtor.

O método criarConta, nas linhas 13 a 21, recebe, por parâmetro, o nome do correntista e o saldo inicial. Em sua implementação, o método verificará se o *array* não atingiu o tamanho limite e, se houver espaço no vetor contas, irá instanciar e armazenar no *array*, na posição controlada pelo atributo numContas, um objeto do tipo ContaBancaria. Além disto, este método incrementa o numContas a cada contaBancaria instanciada.

O método getSomaSaldos(), nas linhas 24 a 30, somará o saldo de todas as contaBancarias. Observe que, neste método, é implementado um for que percorre o *array* contas pelo índice, até a quantidade de contas (numContas) que foi “inserida” neste *array*. Neste for, a variável local soma acumula o saldo de cada conta.

c) uma classe chamada TesteBanco que criará uma instância do tipo Banco e apresentará o seguinte menu de opções:

**(1)** Criar nova conta no banco
**(2)** Soma dos saldos das contas
**(3)** Informações do banco
**(4)** Sair

**A opção 1** deve solicitar o nome do correntista e o saldo inicial e, com estas informações, criar a conta deste cliente.

**A opção 2** deve apresentar a soma do saldo de todos os clientes e a **opção 3** mostrará as informações dos clientes criados neste banco.

**Veja a implementação desta classe:**

![A8_imagem7](C:\Users\Nicol\Downloads\A8_imagem7.jpg)

Observe que, na linha 13, foi instanciado um objeto chamado TecBanco, do tipo Banco, com o nome do banco e com o número 2, para a quantidade máxima de contas, a título de teste.

Na linha 27, o método criarConta é invocado por meio do objeto TecBanco, passando como parâmetro o nome do correntista e o saldo inicial, informados pelo usuário via teclado.

Na linha 31, o método getSomaSaldos é invocado por meio do objeto TecBanco, em uma instrução de saída para que seja mostrada a soma retornada por este método.

Na linha 34, o método toString é invocado por meio do objeto TecBanco para mostrar as informações do banco e de seus clientes.

**Veja a saída de um teste desta aplicação:**

![A8_imagem7](C:\Users\Nicol\Downloads\A8_imagem7.jpg)

![A8_imagem9](C:\Users\Nicol\Downloads\A8_imagem9.jpg)