public class reversearr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        /*int j = arr.length - 1;
        int i = 0;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }*/
        for(int a = 0; a < arr.length/2; a++){
            int temp = arr[a];
            arr[a] = arr[arr.length-1-a];
            arr[arr.length-1-a] = temp;
        }
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }
}