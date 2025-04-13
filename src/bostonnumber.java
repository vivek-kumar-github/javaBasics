import java.util.*;
public class bostonnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int DSum = SumOfDigits(n);
        int FSum = 0;
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                FSum = FSum + SumOfDigits(i);
                n = n / i;
            }
        }
        if(FSum == DSum){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    public static int SumOfDigits(int n){
        int s = 0;
        while(n > 0){
            int d = n % 10;
            s = s + d;
            n = n / 10;
        }
        return s;
    }
}
