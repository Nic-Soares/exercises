public class A {
  int calcula() {return 1; };
  int calcula( int x ) { return 1+x; }

  public static void main(String[] args) {
    A objA = new A();
    System.out.println(objA.calcula());
    System.out.println(objA.calcula(10));
  }
}


