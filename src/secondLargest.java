import java.util.*;
public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {10,10,10};
        Arrays.sort(arr);
        for(int i = arr.length - 1; i > 0; i--){
            if(arr[i] != arr[i-1]){
                System.out.print(arr[i-1]);
                break;
            }
            System.out.print(-1); //not found
        }

    }
}
