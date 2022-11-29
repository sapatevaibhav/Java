import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("ABC");
        list.add("XYZ");
        list.add("PQR");
        list.addFirst("JKL");
        list.add("MNO");
        list.add("AAA");
        System.out.println(list);
        list.add(3, "CCC");
        System.out.println(list);
        list.set(2, "VVV");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(String.valueOf("ABC"));
        System.out.println(list);

        System.out.println(list.contains(String.valueOf("XYZ")));
        System.out.println(list.contains(String.valueOf("ZZZ")));
        System.out.println(list.getLast());
        System.out.println(list.getFirst());
        System.out.println(list.get(3));

        //~ System.out.println(list.size());
        //~ list.clear();
        //~ System.out.println(list);
        //~ System.out.println(list.isEmpty());

    }
}