import java.util.*;

public class ExceptionHandling {

  public static void main(String[] args) {
    int a=0, b=0, c=0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    try {
      a = sc.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Enter Integer value only.");
      System.exit(0);
    }
    System.out.print("Enter second number: ");
    try {
      b = sc.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Enter Integer value only.");
      System.exit(0);
    }
    try {
      c = a / b;
      System.out.println("Division is: " + c);
    } catch (ArithmeticException e) {
      System.out.println("Infinity");
    }
  }
}
