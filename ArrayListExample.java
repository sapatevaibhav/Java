import java.util.*;
public class ArrayListExample{
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList<Integer>(5);
        list.add(10);
        list.add(32);
        list.add(44);
        list.add(63);
        list.add(34);
        list.add(55);
        System.out.println(list);
        list.add(3, 555);
        System.out.println(list);
        list.set(2,33);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(Integer.valueOf(55));
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        list.removeAll(list);
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}