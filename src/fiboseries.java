import java.util.Scanner;
public class fiboseries {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int a = 0;
        int b = 1;
        if(d==0){
            System.out.println("Input is 0 ");
        } else if (d==1) {
            System.out.println(a);
        }else {
            System.out.println(a);
            System.out.println(b);
            for (int i = 1; i <= (d - 2); i++) {
                int c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}