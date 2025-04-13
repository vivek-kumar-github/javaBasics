public class setandgetinThreading extends Thread
{
    public void run()
    {
        System.out.println("running...");
    }
    public static void main(String[] args)
    {
        // creating one thread   
        setandgetinThreading t1=new setandgetinThreading();
        setandgetinThreading t2=new setandgetinThreading();
        // set the priority  
        t1.setPriority(5);
        t2.setPriority(7);
        // print the user defined priority   
        System.out.println("Priority of thread t1 is: " + t1.getPriority()); //4  
        System.out.println("Priority of thread t2 is: " + t2.getPriority()); //7  
        // this will call the run() method  
        t1.start();
    }
}
// Example demonstrating getPriority and setPriority in Java multithreading
/*
public class setandgetinThreading {
    public static void main(String[] args) {
        // Creating threads
        Thread thread1 = new Thread(new Task(), "Thread-1");
        Thread thread2 = new Thread(new Task(), "Thread-2");
        Thread thread3 = new Thread(new Task(), "Thread-3");

        // Setting priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Lowest priority (1)
        thread2.setPriority(Thread.NORM_PRIORITY); // Default priority (5)
        thread3.setPriority(Thread.MAX_PRIORITY); // Highest priority (10)

        // Displaying priorities
        System.out.println(thread1.getName() + " Priority: " + thread1.getPriority());
        System.out.println(thread2.getName() + " Priority: " + thread2.getPriority());
        System.out.println(thread3.getName() + " Priority: " + thread3.getPriority());

        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        // Print current thread details
        System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
    }
}
 */
/*class thread1 extends Thread{
    public thread1(String name){
        super(name);
    }
    //Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("hello "+this.getName());
        }
    }
}
public class setandgetinThreading{
public static void main(String[] args) {
    thread1 t1 = new thread1("abhishek");
    thread1 t2 = new thread1("ankit");
    }
}*/