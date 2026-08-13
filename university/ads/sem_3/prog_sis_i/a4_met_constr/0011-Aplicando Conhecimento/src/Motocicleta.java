public class Motocicleta {
  String modelo;
  String marca;
  int nroChassi;
  String nroPlaca;
  String cor;
  int nroCilindradas;

  public Motocicleta() {
  }

  public Motocicleta(int nroChassi, String nroPlaca) {
   this.nroChassi = nroChassi;
   this.nroPlaca = nroPlaca;
  }

  public Motocicleta(String modelo, String marca) {
    this.modelo = modelo;
    this.marca = marca;
  }

  public void mostraDados(){
    System.out.println("Modelo : " + modelo);
    System.out.println("Marca : " + marca);
    System.out.println("Número do chassi : " + nroChassi);
    System.out.println("Número da placa : " + nroPlaca);
    System.out.println("Cor : " + cor);
    System.out.println("Número de Cilindradas : " + nroCilindradas);
  }

  public static void main(String[] args) {
    Motocicleta m1 = new Motocicleta();
    m1.mostraDados();

    Motocicleta m2 = new Motocicleta(1234566,"EMR4965");
    m2.mostraDados();

    Motocicleta m3 = new Motocicleta ("Kawasaki","KLX 450R");
    m3.mostraDados();
  }
}
