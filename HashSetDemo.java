import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        s1.add(10);
        s1.add(30);
        s1.add(20);

        s2.add(10);
        s2.add(40);
        s2.add(50);

        System.out.println(s1);
        System.out.println(s2);
        s2.addAll(s1);
        System.out.println(s2);
    }
}
