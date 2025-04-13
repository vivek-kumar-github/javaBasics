import java.util.*;
public class swapxor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println(8 | 7);
        int a = input.nextInt();
        System.out.println("enter the second number");
        int b = input.nextInt();
        System.out.println(); */
        int a = input.nextInt();
        int b = input.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.print(a+" ");
        System.out.println(b);
    }
}