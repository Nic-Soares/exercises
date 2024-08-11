import java.util.Scanner;

public class TesteMotocicleta {
  public static void main(String[] args) {
    Motocicleta m1 = new Motocicleta();
    m1.cor= "azul";
    m1.marca= "BMW";
    m1.modelo= "CB400";
    m1.nroChassi= 123456;
    m1.nroCilindradas= 400;
    m1.nroPlaca= "EMR4070";
    System.out.println("Mês licenciamento = " +m1.licenciar());
    int nro = 123456;
    if (m1.checaChassi(nro))
      System.out.println("Chassi verdadeiro");
    else
      System.out.println("Chassi falso");
  }
}
