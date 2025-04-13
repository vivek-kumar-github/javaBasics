public class cadence2 {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        int max = Integer.MIN_VALUE;
        for(int i = -0; i < arr.length; i++){
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(sum,max);
            }
        }
        System.out.print(max);
    }
}
