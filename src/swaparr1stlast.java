import java.util.*;
public class swaparr1stlast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        int a = arr.length - 1;
        int b = arr[0];
        arr[0] = arr[a];
        arr[a] = b;
        for(int i = 0; i <= a; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
