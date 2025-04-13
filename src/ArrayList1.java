import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(30);
        System.out.println(list1.size());
        System.out.println(list1);
        list1.add(3,40);
        System.out.println(list1);
        list1.remove(3);
        System.out.println(list1);
        list1.remove(Integer.valueOf(10));
        System.out.println(list1);
        System.out.println(list1.contains(40));
        System.out.println(list1.get(1));
        list1.set(1,40);
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.lastIndexOf(20));
        System.out.println(list1.lastIndexOf(202));
        System.out.println(list1.indexOf(40));
        list1.add(50);
        list1.add(60);
        list1.add(70);
        System.out.println(list1.subList(1,3));
        list1.clear();
        System.out.println(list1);
        for(int k : list1){
            System.out.println(k);
        }
    }
}