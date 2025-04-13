import java.util.*;
public class length_of_largest_vowel_substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int max = 0;
        for(int i = 0; i < str.length(); i++){
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                char g = str.charAt(j);
                if(g == 'a' || g == 'e' || g == 'i' || g == 'o' || g == 'u'){
                    count++;
                    max = Math.max(max, count);
                }else{
                    break;
                }
            }
        }
        System.out.println(max);
    }
}