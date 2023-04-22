package Work;

/**
 * Observe o código disponível em: <https://ideone.com/oX3c8g>.
 *
 * Refatore-o, utilizando as técnicas de refatoração aprendidas até o momento. Note que este código é uma modificação do exemplo anterior. Neste código, incluímos as informações sobre o fato de o curso ter um trabalho final obrigatório, e se o curso está finalizado e em que ano. No caso de o curso ter um trabalho final obrigatório, este trabalho recebe nomes diferentes de acordo com o nível do curso (Graduação é um TCC, Mestrado é uma Dissertação etc.)
 */

class Aluno{
  private String nome, nome_curso, nível_curso;
  private int cód_matrícula, ano_finalização;
  private boolean é_bolsista, curso_finalizado, tem_trabalho;
  private double mensalidade_curso, desconto;
  private String dados_tcc [] = new String [3];
  //[título do trabalho, nome do orientador, nota do trabalho]
  public Aluno(String nome,
               String nome_curso,
               String nível_curso,
               int cód_matrícula,
               boolean é_bolsista,
               boolean curso_finalizado,
               boolean tem_trabalho,
               int ano_finalização,
               double mensalidade_curso,
               double desconto,
               String dados_tcc[]) {
    this.nome = nome;
    this.nome_curso = nome_curso;
    this.nível_curso = nível_curso;
    this.cód_matrícula = cód_matrícula;
    this.é_bolsista = é_bolsista;
    this.curso_finalizado = curso_finalizado;
    this.tem_trabalho = tem_trabalho;
    this.ano_finalização = ano_finalização;
    this.mensalidade_curso = mensalidade_curso;
    this.desconto = desconto;
    this.dados_tcc = dados_tcc;
  }

  public String getDados()
  {
    String resp = "Aluno: "+ this.nome +"\n";
    resp += "Curso: " + this.nível_curso + " em " + this.nome_curso +"\n";
    if (this.é_bolsista)
    {
      resp += "Bolsista com desconto de: " + this.desconto + "%\n";
      resp += "Mensalidade: R$ " + this.mensalidade_curso*(1-this.desconto/100)+ "\n";
    }
    else resp += "Mensalidade: R$ " + this.mensalidade_curso+ "\n";
    if (this.curso_finalizado)
    {
      resp += "Curso finalizado em "+ano_finalização + "\n";
      if (this.tem_trabalho)
      {
        resp += "Título ";
        switch (nível_curso)
        {
          case "Graduação": resp += "do TCC: "; break;
          case "Lato sensu": resp += "da monografia: "; break;
          case "Mestrado": resp += "da dissertação: "; break;
          case "Doutorado": resp += "da tese: "; break;
        }
        resp += dados_tcc[1] + "\n";
        resp += "Orientador(a): Prof. " + dados_tcc[0] + "\n";
        resp += "Nota: " + dados_tcc[2];
      }
    }
    return resp;
  }
}
