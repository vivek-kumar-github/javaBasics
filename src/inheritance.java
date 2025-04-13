class parent{
    int a=10;
    int b=20;
    public void f1() {
        System.out.println("i m f1 in parent class");
    }
    public void f2() {
        System.out.println("i m f2 in parent class");
    }

}
class child extends parent{
    int a=100;
    int c=200;
    public void f1() {
        System.out.println("i m f1 in child class");
    }
    public void f3() {
        System.out.println("i m f3 in child class");
    }

}
public class inheritance {

    public static void main(String[] args) {
//		case 1
		parent obj=new child();
		System.out.println(obj.a);
		System.out.println(obj.b);
//      System.out.println(obj.c);
		System.out.println(((child)(obj)).c);
		System.out.println(((child)(obj)).a);
		obj.f1(); //overide concept
		obj.f2();
		((child)(obj)).f3();
//		case-2
        child obj1=new child();
        System.out.println(obj.a);
        System.out.println(obj.b);
//      System.out.println(obj.c);
        System.out.println(((parent)(obj)).a);
        obj.f1();
        obj.f2();
//      obj.f3();
    }

}