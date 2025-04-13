import java.util.Arrays;
import java.util.Scanner;

public class insertionSortDesc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i<len; i++){
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] < key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
