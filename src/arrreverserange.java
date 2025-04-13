import java.util.*;
public class arrreverserange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = input.nextInt();
        }
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        for(int i = a1;i <= a2; i++){
            int a = arr[a1];
            arr[a1] = arr[a2];
            arr[a2] = a;
            a2--;
        }
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
}
