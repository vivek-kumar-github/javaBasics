import java.util.Scanner;
public class isarmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = a;
        int b = a;
        double sum = 0;
        int count = 0;
        while (a > 0) {
            a /= 10;
            count++;
        }
        while (b > 0) {
            int ld = b % 10;
            sum = sum + Math.pow(ld, count);
            b /= 10;
        }
        System.out.println(sum);
        if (sum == c) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}