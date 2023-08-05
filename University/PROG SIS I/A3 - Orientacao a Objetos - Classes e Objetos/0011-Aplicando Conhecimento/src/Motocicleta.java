public class Motocicleta {
  String modelo, marca, nroPlaca, cor;
  int nroChassi, nroCilindradas;

  String[] mes = {
          "dezembro", "abril", "maio", "junho", "julho", "agosto", "agosto", "setembro",
          "outubro", "novembro"
  };
  public String licenciar() {
    int valor;
    int tamanho = nroPlaca.length();
    valor = Integer.parseInt(nroPlaca.substring(tamanho - 1));

    return mes[valor];
  }

  public boolean checaChassi(int nro) {
    boolean infoChassi = nro == nroChassi;
    return infoChassi;
  }
}
