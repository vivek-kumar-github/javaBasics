import java.util.*;
import java.util.stream.Collectors;

public class array2list {
    public static void main(String[] args) {
        int[] ints = new int[] {1,2,3,4,5};
        List<Integer> list11 =Arrays.stream(ints).boxed().collect(Collectors.toList());
        System.out.println(list11);
        System.out.println(Integer.valueOf("00001111",2));
        System.out.println(Integer.toBinaryString(4));
    }
}