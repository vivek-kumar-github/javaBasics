import java.util.Arrays;
import java.util.Scanner;

public class selectionSortDesc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i<len; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            int max_idx = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] > arr[max_idx]) max_idx = j;
            }
            int temp = arr[i];
            arr[i] = arr[max_idx];
            arr[max_idx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
