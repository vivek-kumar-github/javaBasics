class box1 {
    private double l;
    double b;
    double h;
    box1(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    // getter and setter
    public void setlen(double l) throws Exception {
        try {
            if (l <= 0) {
                throw new Exception("-ve nhi hota length");
            }
            this.l = l;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public double getlen() {
        return l;
    }
    public double vol() {
        return l*b*h;
    }
}
public class oops_practice1 {
    public static void main(String[] args) throws Exception {
        box1 b1=new box1(2,3,1.5);
        box1 b2=new box1(4,3,1.5);
      	//b1.l=-3;
        b1.setlen(-3);
        System.out.println(b1.getlen());
        System.out.println(b1.vol());
        System.out.println(b2.vol());
    }

}