public class Funcionario {
  protected String nome;
  protected String sobrenome;
  protected int numFunc;
  protected double salario;

  Funcionario (String nome, String sobrenome, int numFunc){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.numFunc = numFunc;
  }

  @Override
  public String toString(){
    return "Número do Funcionário: " + numFunc + "\nNome: " + nome + "\nSalário a pagar: " + salario;
  }
}
