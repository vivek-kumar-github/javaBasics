public class pascaltriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i <= n;i++){
            for(int j = 0; j <= n - i; j++){
                System.out.print("  ");
            }
            int c = 1;
            for(int a = 1; a<=i; a++){
                System.out.print(c + "   ");
                c = c*(i-a)/a;
            }
            if(i<n) System.out.println();
        }
    }
}
