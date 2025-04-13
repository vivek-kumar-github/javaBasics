// By implementing runnable interface
class runnable1 implements Runnable{
    // override run function of thread class
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("hello");
        }
    }
}
class runnable2 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("Welcome");
        }
    }
}
public class multithreding2 {
    public static void main(String[] args) {
        runnable1 r1 = new runnable1();
        runnable2 r2 = new runnable2();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}