import java.math.BigInteger;
import java.util.Scanner;
public class factorialBigNum {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        BigInteger result = factorial(num);
        System.out.println(result);
    }
}
