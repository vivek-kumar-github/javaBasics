import java.util.*;
public class nthfibonum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a==1) System.out.println(0);
        else if (a==2) System.out.println(1);
        else{
        int fibo=0;
        int b = 0;
        int c = 1;
        for(int i = 0;i<a-2;i++){
            fibo = b + c;
            b = c;
            c = fibo;
        }
            System.out.println(fibo);
        }
    }
}
