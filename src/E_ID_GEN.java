class employee{
    String fname;
    String lname;
    String dep;
    int random;
    int pos;
    employee(String fname,String lname,String dep,int random,int pos){
        this.fname=fname;
        this.lname=lname;
        this.dep=dep;
        this.random=random;
        this.pos=pos;
    }
    public String id() {
        String ans="";
        String longer;
        String shorter;
        if(fname.length()<lname.length()) {
            longer=lname;
            shorter=fname;
        }else if(fname.length()>lname.length()) {
            longer=fname;
            shorter=lname;
        }else {
            if(fname.compareTo(lname)>=0) {
                longer=fname;
                shorter=lname;
            }else {
                longer=lname;
                shorter=fname;
            }

        }
        ans+=shorter.charAt(0);
        ans+=dep;
        ans+=longer.charAt(longer.length()-1);
        String randomstr=String.valueOf(random);
        ans+=randomstr.substring(pos,pos+2);
        return ans;
    }
}
public class E_ID_GEN {

    public static void main(String[] args) {
        employee e1=new employee("JOHN","SMITH","HR",62789,2);
        employee e2=new employee("Vivek","Kumar","Admin",62789,3);
        System.out.println(e1.id());
        System.out.println(e2.id());

    }

}