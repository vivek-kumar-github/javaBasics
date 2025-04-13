import java.util.*;
public class replaceint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int sum = 0;
        int p = 1;
        while(a>0){
            int ld = a % 10;
            if (ld==a1){
                ld=a2;
            }
            a = a/10;
            sum = sum + ld * p;
            p = p*10;
        }
        System.out.println(sum);
    }
}
