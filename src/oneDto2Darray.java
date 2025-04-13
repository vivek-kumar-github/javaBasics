import java.util.*;
public class oneDto2Darray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 1; i <=n; i++){
            if(i<=x){
                System.out.print(arr[i-1]+" ");
                if(i%x==0) System.out.println();
            }
            if(i>x){
                System.out.print(arr[i-1]+" ");
            }
        }
    }
}