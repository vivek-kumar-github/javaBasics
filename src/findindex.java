public class findindex {
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,4};
        int t = 3;
        int t1 = 4;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == t) System.out.println("Index of 3 "+i);
            if(arr[i] == t1) System.out.println("Index of 4 "+i);
        }
    }
}
