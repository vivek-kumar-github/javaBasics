import java.util.Scanner;
public class nextPerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sqrt = (int) Math.sqrt(num); // Find the integer part of the square root
        int PSquare = (sqrt + 1) * (sqrt + 1); // Find the next perfect square
        System.out.println(PSquare);
        scanner.close();
    }
}

