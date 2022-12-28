abstract class Student {
    abstract  void studentName(String s);
    abstract void rollNo(int r);
    abstract void examMarks(double m);
    abstract void className(String c);
}

class student1 extends Student {
    void studentName(String s1) {
        System.out.println(s1);
    }
    void rollNo(int r1) {
        System.out.println(r1);
    }

    void examMarks(double m1) {
        System.out.println(m1);
    }

    void className(String n1) {
        System.out.println(s1);
    }
}

class student2 extends Student {
    void studentName(String s2) {
        System.out.println(s2);
    }

    void rollNo(int r2) {
        System.out.println(r2);
    }

    void examMarks(double m2) {
        System.out.println(m2);
    }

    void className(String n2) {
        System.out.println("SE IT 2");
    }
}

class student3 extends Student {
    void studentName() {
        System.out.println("Abhishak");
    }

    void rollNo() {
        System.out.println(88);
    }

    void examMarks() {
        System.out.println(85.12);
    }

    void className() {
        System.out.println("SE IT 2");
    }
}

class student4 extends Student {
    void studentName() {
        System.out.println("Akshay");
    }

    void rollNo() {
        System.out.println(76);
    }

    void examMarks() {
        System.out.println(90.78);
    }

    void className() {
        System.out.println("SE IT 2");
    }
}

class student5 extends Student {
    void studentName() {
        System.out.println("Pratik");
    }

    void rollNo() {
        System.out.println(85);
    }

    void examMarks() {
        System.out.println(75.33);
    }

    void className() {
        System.out.println("SE IT 1");
    }
}

public class AbstractClassEx {
    public static void main(String[] args) {
        student1 s1 = new student1();
        student2 s2 = new student2();
        student3 s3 = new student3();
        student4 s4 = new student4();
        student5 s5 = new student5();
        s1.rollNo();
        s1.studentName();
        s1.className();
        s1.examMarks();
        s2.rollNo();
        s2.studentName();
        s2.className();
        s2.examMarks();
        s3.rollNo();
        s3.studentName();
        s3.className();
        s3.examMarks();
        s4.rollNo();
        s4.studentName();
        s4.className();
        s4.examMarks();
        s5.rollNo();
        s5.studentName();
        s5.className();
        s5.examMarks();
    }
}
