class detail{
    String shorter;
    String longer;
    String cat;
    int ord;
    int n;
    detail(String shorter,String longer,String cat,int ord,int n){
        this.shorter = shorter;
        this.longer = longer;
        this.cat = cat;
        this.ord = ord;
        this.n = n;
    }
    public void shorterstr(){
        if(shorter.length()>longer.length()){
            String temp = longer;
            longer = shorter;
            shorter = temp;
        } else if(shorter.length()==longer.length()){
            if(shorter.compareTo(longer)>0){
                String temp1 = longer;
                longer = shorter;
                shorter = temp1;
            }
        }
    }
}
public class ID_Gen {
    public static void main(String[] args) {
        detail s1 = new detail("Alice","Novel","Books",12356,3);
        s1.shorterstr();
        String ans = "";
        ans += s1.shorter.charAt(s1.shorter.length()-1) + s1.cat + s1.longer.charAt(0);
        String a = String.valueOf(s1.ord);
        String b = a.substring(s1.n,s1.n+2);
        ans += b;
        System.out.println(ans);
    }
}
