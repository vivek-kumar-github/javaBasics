import java.util.*;
public class arrmaxmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i<len; i++){
            arr[i] = input.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(i>max) max = i;
            else if (i<min) min = i;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
