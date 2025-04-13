import java.util.*;

public class iteratorList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i = 0; i<5;i++){
            l1.add(input.nextInt());
        }
        Iterator<Integer> it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
