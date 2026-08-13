package quest06;

public class TestaBiblioteca {
  public static void main(String[] args) {
    Biblioteca bib = new Biblioteca("endereco", "Jorge");
    bib.livro[0].titulo = "Terra de Historias";
    bib.livro[0].autor = "Nao lembro";
    bib.livro[0].emprestado = true;

    bib.livro[0].mostraLivro();


//    livro.titulo[0] = "Terra de Historias";
//    livro.autor = "Nao lembro";
//    livro.emprestado = true;
//
//    Biblioteca biblioteca = new Biblioteca("endereco01", "Jorge", livro);
//
//    boolean disp = false;
//
//    disp = biblioteca.verDisponibilidade(livro[0].titulo);
//
//    System.out.println(disp);
  }
}
