/*
Deepak and Gautam are having a discussion on a new type of number that they call Coding Blocks Number or CB Number.
They use following criteria to define a CB Number.
1. 0 and 1 are not a CB number.
2. 2,3,5,7,11,13,17,19,23,29 are CB numbers.
3. Any number not divisible by the numbers in point 2( Given above) are also CB numbers.
Deepak said he loved CB numbers.Hearing it, Gautam throws a challenge to him.
Gautam will give Deepak a string of digits. Deepak's task is to find the number of CB numbers in the string.
CB number once detected should not be sub-string or super-string of any other CB number.
Ex- In 4991, both 499 and 991 are CB numbers, but you can choose either 499 or 991, not both.
Further, the CB number formed can only be a sub-string of the string.
Ex - In 481, you can not take 41 as CB number because 41 is not a sub-string of 481.
As there can be multiple solutions, Gautam asks Deepak to find the maximum number of CB
numbers that can be formed from the given string.
Deepak has to take class of Launchpad students. Help him by solving Gautama's challenge.
Input format
First line contain size of the string.
Next line is A string of digits.
Output format
Maximum number of CB numbers that can be formed.
Example 1
Input
5
81615
Output
2
Explanation
61 and 5 are two CB numbers.
*/
import java.util.*;
public class findCBnumber {
    public static boolean iscb(int b){
        int[] arr = {2,3,5,7,11,13,17,19,23,29};
        boolean x=true;
        if(b==0 || b==1){
            x=false;
        }else{
            for(int k : arr){
                if(b==k) x=true;
                else if(b%k == 0) x = false;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        int count = 0;
        String b = "";
        for(int i = 0;i<=a;i++){
            for(int j = i+1;j<=a;j++){
                b = s.substring(i,j);
                int p = Integer.parseInt(b);
                if(iscb(p)){
                    i=j;
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
