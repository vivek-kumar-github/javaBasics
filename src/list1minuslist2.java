import java.util.*;
//given list l1 and l2 remove all the elements of l2 from l1;
public class list1minuslist2 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(1);
        for (Integer k : l2) {
            l1.remove(k);
        }
        System.out.println(l1);
    }
}