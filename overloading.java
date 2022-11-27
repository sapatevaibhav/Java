class Multiplyfun{
    static int multiply(int a, int b){
        return a * b;
    }
    static double multiply(double a, double b){
        return a * b;
    }
}
class overloading{
    public static void main(String[] args){
        System.out.println(Multiplyfun.multiply(2,4));
        System.out.println(Multiplyfun.multiply(2.2,2.3));
    }
}