package Questao0010;
public class Carro{

  public static void main (String args[]){
    char [] vet = {'k', '1', 'p', 'r'};
    char aux = 'm';
    int i;

    for (i=0; i<4; i++){
      if (vet[i] < aux)
        System.out.print ("" + vet[i]);

    }
  }
}
