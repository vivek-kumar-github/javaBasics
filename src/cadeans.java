public class cadeans {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        int maxsum=Integer.MIN_VALUE;
        int runsum=0;
        for(int i=0;i<arr.length;i++){
            runsum+=arr[i];
            maxsum=Math.max(maxsum,runsum);
            if(runsum<0) runsum=0;
        }
        System.out.println(maxsum);
    }
}
