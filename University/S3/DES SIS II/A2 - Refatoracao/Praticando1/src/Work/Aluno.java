package Work;

/*
 * Observe o código disponível em: < https://ideone.com/tIRV4G>.  
 * Refatore-o, utilizando as duas técnicas de refatoração aprendidas até o momento. 
*/

class Aluno{
  private String nome, nome_curso, nível_curso;
  private int cód_matrícula;
  private boolean é_bolsista;
  private double mensalidade_curso, desconto;

  public Aluno(String nome,
               String nome_curso,
               String nível_curso,
               int cód_matrícula,
               boolean é_bolsista,
               double mensalidade_curso,
               double desconto) {
    this.nome = nome;
    this.nome_curso = nome_curso;
    this.nível_curso = nível_curso;
    this.cód_matrícula = cód_matrícula;
    this.é_bolsista = é_bolsista;
    this.mensalidade_curso = mensalidade_curso;
    this.desconto = desconto;
  }

  public String getDados()
  {
    String resp = "Aluno: "+ this.nome +"\n";
    resp += "Curso: " + this.nível_curso + " em " + this.nome_curso +"\n";
    if (é_bolsista)
    {
      resp += "Bolsista com desconto de: " + this.desconto + "%\n";
      resp += "Mensalidade: R$ " + this.mensalidade_curso*(1-this.desconto/100);
    }
    else resp += "Mensalidade: R$ " + this.mensalidade_curso;

    return resp;
  }
}
