public class Mensalista extends Funcionario {
  double salMensal;

  Mensalista(String nome, String sobrenome, int numFunc, double salMensal) {
    super(nome, sobrenome, numFunc);
    this.salMensal = salMensal;
  }

  void calcSalario(int falta){
    salario = salMensal - (salMensal * 0.02 * falta);
  }

  @Override
  public String toString(){
    return super.toString() + "\nSalário Mensal: " + salMensal;
  }
}
