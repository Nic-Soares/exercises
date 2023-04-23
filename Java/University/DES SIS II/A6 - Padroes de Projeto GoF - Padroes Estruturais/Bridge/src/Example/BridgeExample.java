package Example;

public class BridgeExample {
  public static void main(String[] args) {
    Shape square = new Square(new RedColor());
    Shape circle = new Circle(new GreenColor());
    System.out.println(square.draw());
    System.out.println(circle.draw());
  }
}