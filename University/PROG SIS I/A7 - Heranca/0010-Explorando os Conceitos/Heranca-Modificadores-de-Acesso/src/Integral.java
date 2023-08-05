public class Integral extends Professor{
  protected double salario;

  public Integral (String nome, String matricula, int idade, double salario){
    super(nome, matricula, idade);
    this.salario = salario;
  }

  public void setSalario(){
    super.salarioMensal = salario;
  }

  public String toString(){
    return super.toString();
  }
}
