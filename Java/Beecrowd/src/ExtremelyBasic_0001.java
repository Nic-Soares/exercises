import java.io.IOException;
import java.util.Scanner;

public class ExtremelyBasic_0001 {
  public static void main(String[] args) throws IOException {
    int A, B, X;

    Scanner input = new Scanner(System.in);
    A = input.nextInt();
    B = input.nextInt();
    X = B + A;
    System.out.println("X = " + X);

  }
}
