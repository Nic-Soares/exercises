import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeituraArquivo {

  public static void main(String[] args) {

    String arquivo = "alunos.txt";
    ArrayList<Double> notas = new ArrayList<>();
    double somaNotas = 0;

    try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
      String linha = br.readLine();

      while (linha != null) {
        String[] campos = linha.split(";");
        double nota = Double.parseDouble(campos[2]);
        notas.add(nota);
        somaNotas += nota;
        linha = br.readLine();
      }
    } catch (IOException e) {
      System.out.println("Erro ao ler o arquivo: " + e.getMessage());
    }

    double media = somaNotas / notas.size();
    System.out.println("Media das notas = " + media);

    for (double nota : notas) {
      if (nota >= media) {
        System.out.println("Nota Maior que a Media => " + nota);
      }
    }
  }
}
