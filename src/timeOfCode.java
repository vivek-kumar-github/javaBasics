public class timeOfCode {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        //YOUR CODE HERE TO FIND ITS EXECUTION TIME
        int n = 2435;
        int rem;
        int sum = 0;
        while(n>0){
            rem = n%10;
            sum = sum*10+rem;
            n/=10;
        }
        System.out.println(sum);
        System.gc();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Duration: " + duration / 1000000.0 + " ms");
    }
}
