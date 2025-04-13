public class box {
    double width;
    double height;
    double depth;
    box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public void volume(){
        System.out.println(width*height*depth);
    }
    static {
        System.out.println("Hii it is a static block");
    }
}
