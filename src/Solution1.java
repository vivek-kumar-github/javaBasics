import java.util.*;
public class Solution1{
    public static void main(String[] args) {
        String s = "adhd";
        int a = 0;
        List<Integer> l1 = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char d = s.charAt(i);
            int e = (int) d;
            l1.add(e);
        }
        for(int i = 0; i < (s.length() - 1); i++){
            int b = l1.get(i);
            int c = l1.get(i+1);
            a += Math.abs((b-c));
        }
        System.out.println(a);
    }
}