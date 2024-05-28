public class TesteAluno {
  public static void main(String[] args) {
    Aluno alu1 = new Aluno();
    Endereco local = new Endereco();
    local.logradouro = "Rua do Sol";
    local.numero = 327;
    local.CEP = "03344-080";
    local.cidade = "Barueri";
    local.estado = "Barueri";
    alu1.tia = 42089679;
    alu1.nome = "Carlos de Souza";
    alu1.endereco = local; //Associaçao do local ao Aluno or meio do atributo endereço
    System.out.println("Aluno: " + alu1.nome);
    System.out.println("Endereço: "+ alu1.endereco.logradouro + ", "+
                                alu1.endereco.numero+ "\n" + alu1.endereco.CEP+
                        " - " + alu1.endereco.cidade + " - "+
                                alu1.endereco.estado);
  }
}
