public class Casa {
  String cor;
  // criar o vetor com as portas
  Porta [] porta = new Porta[3];

  Casa (){
    cor = "branco";
    // instanciar as portas
    for (int i=0; i < porta.length; i++){
      porta [i] = new Porta();
    }
  }

  public void pinta (String cor){
    this.cor = cor;
  }

  public int portasAbertas(){
    int cont = 0;
    for (int i = 0; i < porta.length; i++){
      if (porta[i].estaAberta())
        cont++;
    }
    return cont;
  }
}
