package quest06;

public class Test {
  public static void main (String args[]){


    Data data = new Data(22,11,21);
    Cliente cliente = new Cliente("999.999.999.99", "Pedro",  4000, data);


    System.out.println(cliente.defineStatus());

    System.out.println(cliente.data.dia + "/" + cliente.data.mes + "/" + cliente.data.ano);


  }
}