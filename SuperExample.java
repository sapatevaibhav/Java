class Animal {
    int era = 50000;
    Animal() {
        System.out.println("This is Animal class");
    }

    void information() {
        System.out.println("Animals are living beings");
        System.out.println("They live on earth since "+era+" years");
    }
}

class Tiger extends Animal {
    Tiger() {
        super();
        System.out.println("This is Tiger class");
    }

    void information() {
        super.information();
        System.out.println("Tiger is Danger animal");
        System.out.println("They live on earth since "+super.era+" years");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.information();
    }
}
