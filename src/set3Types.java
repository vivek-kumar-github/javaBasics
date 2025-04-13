import java.util.*;
public class set3Types {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new LinkedHashSet<>();
        Set<Integer> s3 = new HashSet<>();
        for(int i = 0; i<5;i++){
            s1.add(input.nextInt());
        }
        System.out.println(s1);
        for(int i = 0; i<5;i++){
            s2.add(input.nextInt());
        }
        System.out.println(s2);
        for(int i = 0; i<5;i++){
            s3.add(input.nextInt());
        }
        System.out.println(s3);
    }
}