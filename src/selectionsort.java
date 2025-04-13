import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i<len; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            int min_idx = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[min_idx]) min_idx = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
