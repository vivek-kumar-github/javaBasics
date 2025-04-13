import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int i;
        if (a>b) {
            i = a;
        } else {
            i = b;
        }
        for (i = i; i>1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                System.exit(1);
            }
        }
        System.out.println(1);
    }
}
