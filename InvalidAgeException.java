import java.util.*;

class AgeMismatchException extends Exception {

  public AgeMismatchException() {
    System.out.println("Sorry but you cannot travel by air");
  }
}

class InvalidAgeException {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    try {
      if (age < 5) {
        throw new AgeMismatchException();
      }
    else{
        System.out.println("Welcome to air");
    }
    } catch (AgeMismatchException e) {
      System.out.println(e);
    }
  }
}
