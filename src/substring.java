public class substring {
    public static void main(String[] args) {
        String a = "GlaUni";
        int b = a.length();
        for (int i = 0; i<b; i++){
            for (int j = i; j<b; j++){
                System.out.print(a.substring(i,j+1));
                System.out.println();
            }
        }
    }
}
