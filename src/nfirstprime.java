import java.util.*;
public class nfirstprime{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int cnt = 0;
        int n = 2;
        while(cnt<num){
            boolean t = true;
            for (int i=2; i*i <= n;i++) {
                if (n%i == 0){
                    t = false;
                    break;
                }
            }
            if (t){
                System.out.println(n);
                cnt++;
            }
            n++;
        }
    }
}