import java.util.Scanner;
public class last_n_1st_index_of_given_int {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        int a = input.nextInt();
        int min = size-1;
        int max = 0;
        for(int i = 0; i < size; i++){
            if((arr[i]==a) && (i < min)) min = i;
            if((arr[i]==a) && (i > max)) max =i;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
