public class stringpalindrome {
    public static void main(String[] args) {
        String a = "helleh";
        String b = "";
        for(int i = a.length() - 1; i >= 0; i--){
            b += a.charAt(i);
        }
        if((a.equals(b))) System.out.println("True");
        else System.out.println("False");
    }
}