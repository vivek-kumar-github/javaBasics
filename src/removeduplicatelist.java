import java.util.*;
public class removeduplicatelist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i = 0; i<5;i++){
            l1.add(input.nextInt());
          }
        for(int k : l1){
            if(!l2.contains(k)) l2.add(k);
        }
        System.out.println(l2);
    }
}