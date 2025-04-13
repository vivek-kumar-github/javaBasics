import java.util.*;
public class endTermExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        //array
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        */

        //String a = input.nextLine();
        /* Q 4
        String b = new StringBuilder(a).reverse().toString();
        if(a.equals(b)) System.out.println("YES");
        else System.out.println("NO");*/


        // Q 5 AND Q 10
        /*
        String a = input.nextLine();
        String v = "aeiou";
        a = a.toLowerCase();
        int count = 0;
        for(int i = 0; i < a.length(); i++){
            if(v.contains(String.valueOf(a.charAt(i)))){
                //System.out.print(i+" ");
                count++;
            }
        }
        System.out.print(count);
         */

        /* Q 6
        String s = "";
        for (int i = 0; i < a.length(); i++) {
            if(Character.isUpperCase(a.charAt(i))) s += Character.toLowerCase(a.charAt(i));
            else s += Character.toUpperCase(a.charAt(i));
        }
        System.out.println(s);
         */

        // Q 7
        /*
        char ch = input.next().charAt(0);
        int n = input.nextInt();
        input.nextLine();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += input.next().charAt(0);
        }
        System.out.println(s.indexOf(ch));
         */

        // Q 9
        /*
        String s = input.nextLine();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') count++;
        }
        System.out.println(count);

         */
         /*
        String s = "Hii how are you i am vivek";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
          */

        // Q 11
        /*
        String s = input.nextLine();
        Set<String> s1 = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            s1.add(String.valueOf(s.charAt(i)));
        }
        System.out.println(s1);
         */

        // Q 12
        /*
        int a = input.nextInt();
        if(a !=2 && a%2 == 0) System.out.println("YES");
        else System.out.println("NO");
         */

        // Q 13
        /*
        String s = input.nextLine();
        String s1 = s.substring(1,s.length());
        String s2 = String.valueOf(s.charAt(0)).toUpperCase();
        System.err.println(s2+s1);
         */
        // Q 14
        /*
        String s = input.nextLine();
        int c = 0;
        char pre = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==pre){
                pre = s.charAt(i);
                if(++c == 7){
                    System.out.println("YES");
                    return;

                }
            }
            pre = s.charAt(i);
        }
        System.out.println("NO");

         */
        // Q 50
        /*
        String a = input.next();
        String b = input.next();
        String c = input.next();
        char[] x = c.toCharArray();
        Arrays.sort(x);
        char[] y = (a+b).toCharArray();
        Arrays.sort(y);
        String j = new String(x);
        String k = new String(y);
        if(j.equals(k)) System.out.println("YES");
        else System.out.println("NO");

         */
        // Q 49
        /*
        long a = input.nextLong();
        if(a <= 1){
            System.out.println("Not Prime");
            return;
        }
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");

         */
        // Q 48
        /*
        int a = input.nextInt();
        if(a==1) System.out.println(0);
        else if (a==2) System.out.println(1);
        else{
            int fibo=0;
            int b = 0;
            int c = 1;
            for(int i = 0;i<a-1;i++){
                fibo = b + c;
                b = c;
                c = fibo;
            }
            System.out.println(fibo);
        }

         */
        // Q 45
        /*
        int x = input.nextInt();
        int y = input.nextInt();
        if(x>0 && y>0) System.out.println("Quadrant I");
        else if(x < 0 && y > 0) System.out.println("Quadrant II");
        else if(x<0 && y<0) System.out.println("Quadrant III");
        else if(x>0 && y<0) System.out.println("Quadrant IV");
        else if(x==0 && y==0) System.out.println("Origin");
        else if(x==0 || y==0) System.out.println("Axes");

         */
        // Q 42 Distinct Elements in String Array
        /*
        String[] arr = {"apple", "orange", "banana", "apple", "grape", "banana", "apple", "orange", "grape", "kiwi", "kiwi", "kiwi"};
        Set<String> s = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(s);

         */
        // Q 41 Count the Number of Possible Triangles
        /*
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        int count = 0;

        // Iterate through all combinations of i, j, k
        for (int i = 0; i < n - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < n - 1; j++) {
                while (k < n && arr[i] + arr[j] > arr[k]) {
                    k++;
                }
                count += (k - j - 1);
            }
        }

        System.out.println(count);

         */
        // Q 47 GCD
        /*
        int a = input.nextInt();
        int b  = input.nextInt();
        System.out.println(gcd(b,a));

         */
        // Q 46 LCM
        /*
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(lcm(a,b));

         */
        // Q 44 Find First and Last Position of Element in Sorted Array
        /*
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        Arrays.sort(arr);
        findFirstLastIndex solution = new findFirstLastIndex();
        System.out.println(Arrays.toString(solution.searchRange(arr, target)));

         */
        // Q 40 Binary to decimal
        /*
        String a = input.next();
        int dec = Integer.parseInt(a,2);
        System.out.println(dec);

        // Decimal to Binary
        String bin = Integer.toBinaryString(dec);
        System.out.println(bin);

         */
        // Q 38 Array Merge
        /*
        int[] arr = {1,3,5,7,9};
        int[] arr1 = {2,4,6};
        int a = arr.length;
        int b = arr1.length;
        int[] ne = new int[a+b];
        for(int i = 0; i < a; i++){
            ne[i] = arr[i];
        }
        int x = 0;
        for(int i = a; i < a+b; i++){
            ne[i] = arr1[x];
            x++;
        }
        Arrays.sort(ne);
        System.out.println(Arrays.toString(ne));

         */

    }
    public static int gcd(int p, int q){
        if(q == 0) return p;
        int r = p % q;
        return gcd(q,r);
    } //end

    public static int lcm(int a, int b){
        return Math.abs(a * b) / gcd(a, b);
    } //end
}