public class Numeros {
  int n1, n2;

  public float calcular (int op) {
    float res = 0;
    switch (op){
      case 1:
        res = n1+n2;
        break;

      case 2:
        res = n1-n2;
        break;

      case 3:
        res = n1*n2;
        break;

      case 4:
        if ( (n2!=0))
          res = (float) n1/n2;
        else
          System.out.println("Nao há divisao por zero");
        break;
    }
    return res;
  }
}
