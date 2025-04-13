import java.util.*;
public class euclidgcd {
    public static int gcd(int p, int q){
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(gcd(a,b));
    }
}
