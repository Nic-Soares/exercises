public class Professor {
  protected String nome;
  protected String matricula;
  protected int idade;
  protected double salarioMensal;

  // CONSTRUTOR
  Professor (String nome, String matricula, int idade){
    this.nome = nome;
    this.matricula = matricula;
    this.idade = idade;
  }

  @Override
  public String toString(){
    return "\nNome: " +  nome + "\nMatricula: " + matricula + "\nIdade: " + idade + "\nSalario: " + salarioMensal;
  }
}
