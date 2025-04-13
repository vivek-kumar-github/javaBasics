import java.util.*;
public class isfibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if((x==0) || (x==1)){
            System.out.println("yes");
        }else {
            int a = 0;
            int b = 1;
            int c;
            while(true){
                c = a + b;
                a = b;
                b = c;
                if(c == x) {
                    System.out.println("Yess");
                    break;
                }else if (c > x){
                    System.out.println("Noo");
                    break;
                }
            }
        }
    }
}
