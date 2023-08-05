package quest06;

public class Livro{
  String titulo;
  String autor;
  boolean emprestado;

  void mostraLivro(){
    System.out.println("Título do Livro: " + titulo);
    System.out.println("Autor do Livro: " + autor);
    if (emprestado){
      System.out.println("Status do Livro: EMPRESTADO");
    }
    else {
      System.out.println("Status do Livro: DISPONIVEL");
    }
  }
}
