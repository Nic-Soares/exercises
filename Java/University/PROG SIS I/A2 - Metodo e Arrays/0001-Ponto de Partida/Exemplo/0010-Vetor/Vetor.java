public class Vetor {
  public static void main (String[] args) {
    int [] vet = {45, 32, 21, 10};
    
    //for que mapeia o vetor pelo elemento
    for (int x:vet) {
      System.out.println(x);
    }
    
    System.out.println("Mostrando novamente os elementos");
    
    // dor que mapeia os vetor pelo indice
    for(int i=0; i<vet.length; i++) {
      System.out.println(vet[i]);
    }
  }
}
  
