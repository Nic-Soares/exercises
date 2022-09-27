package Questao0100;
public class Carros {

    String marcaModelo;
    int cargaMaxima;
    int kmRodados;

    Carros(String marcaModelo, int cargaMaxima) {
        this.marcaModelo = marcaModelo;
        this.cargaMaxima = cargaMaxima;
        this.kmRodados = 0;
    }

    public void mostrar() {
        System.out.println(marcaModelo + " " + cargaMaxima + " " + kmRodados);
    }

    public void atualizaKm(int kmRodados){
        this.kmRodados = kmRodados;
    }
}
