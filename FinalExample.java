class AgeInfo {
    void Info(){
        System.out.println("This is not final class");
    }
}

final class afterFive extends AgeInfo {
    final int age = 19;

    final void afterFiveY() {
        super.Info();
        System.out.println("I am " + age + " years old");
        System.out.println("After five years I will be of " + (age + 5) + " years old");
    }
}

public class FinalExample {
    public static void main(String[] args) {
        afterFive af = new afterFive();
        af.afterFiveY();
    }
}
