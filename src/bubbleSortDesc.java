import java.util.Arrays;
import java.util.Scanner;

public class bubbleSortDesc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i<len; i++){
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}