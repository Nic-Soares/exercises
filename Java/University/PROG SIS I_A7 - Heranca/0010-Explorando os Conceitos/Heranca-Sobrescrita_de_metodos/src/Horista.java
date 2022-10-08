public class Horista extends Funcionario{
  double salHora;
  int numHoras;

  Horista(String nome, String sobrenome, int numFunc, double salHora, int numHoras){
    super(nome, sobrenome, numFunc);
    this.salHora = salHora;
    this.numHoras = numHoras;
  }

  void calcSalario(){
    salario = salHora*numHoras;
  }

  @Override
  public String toString(){
    return super.toString() + "\nSalário Hora: " +  salHora + "\nHoras Trabalhadas: " + numHoras;
  }
}
