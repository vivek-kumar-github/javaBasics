import java.util.*;
public class linearsearcharay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = input.nextInt();
        }
        int n = input.nextInt();
        int i = 0;
        for(int k : arr){
            if(k==n) System.out.println(i);
            i++;
        }
    }
}
