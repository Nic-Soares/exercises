package quest06;

public class Biblioteca {
  String endereco;
  String nomeBibliotecario;
  Livro [] livro = new Livro[1500];

  public Biblioteca(String endereco, String nomeBibliotecario){
    this.endereco = endereco;
    this.nomeBibliotecario = nomeBibliotecario;
  }

  public  boolean verDisponibilidade (emprestado){
    if (emprestado)
      return true;
    return false;
 }
}
