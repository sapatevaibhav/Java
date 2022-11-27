import java.util.*;

class Marks {

  int eng, math, science;
  Scanner sc = new Scanner(System.in);

  void getMarks() {
    System.out.print("Enter English marks: ");
    eng = sc.nextInt();
    System.out.print("Enter Mathematics marks: ");
    math = sc.nextInt();
    System.out.print("Enter Science marks: ");
    science = sc.nextInt();
  }
}

class Average extends Marks {

  int average;

  void calculateAverage() {
    average = (eng + math + science) / 3;
  }
}

class Display extends Average {

  void displayAverage() {
    System.out.println("Your average is: " + average);
  }
}

public class MultilevelInheritance {

  public static void main(String args[]) {
    Display da = new Display();
    da.getMarks();
    da.calculateAverage();
    da.displayAverage();
  }
}
