class ITDept {
    void collegeName() {
        System.out.println("Sinhgad College of Engineering");
    }

    void buildingName() {
        System.out.println("C3");
    }

    void floorNumber() {
        System.out.println("First and Forth");
    }

    void studentIntake() {
        System.out.println(120);
    }
}

class CODept extends ITDept {
    void floorNumber() {
        System.out.println("Second and Third");
    }

    void studentIntake() {
        System.out.println(180);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        CODept co = new CODept();
        ITDept it = new ITDept();

        it.collegeName();
        co.collegeName();
        it.buildingName();
        co.buildingName();
        it.floorNumber();
        co.floorNumber();
        it.studentIntake();
        co.studentIntake();
    }
}
