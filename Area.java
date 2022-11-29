import java.util.*;
abstract class Shape {
    double width, height;
    abstract void compute_area();
}
class Triangle extends Shape {
    public void compute_area(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base of triangle");
        this.width = scanner.nextDouble();
        System.out.println("Enter height of triangle");
        this.height = scanner.nextDouble();
        double area;
        area = 0.5 * (this.width * this.height);
        System.out.println("Area of triangle: "+ area);
        scanner.close();
    }
}class Rectangle extends Shape {
    void compute_area(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of rectangle");
        this.width = scanner.nextDouble();
        System.out.println("Enter height of rectangle");
        this.height = scanner.nextDouble();
        double area;
        area = this.width * this.height;
        System.out.println("Area of Rectangle: "+ area);
        scanner.close();
    }
}
class Area{
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.compute_area();
        Rectangle r = new Rectangle();
        r.compute_area();
    }
}