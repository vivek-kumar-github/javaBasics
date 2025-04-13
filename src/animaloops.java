class animal {
    public void eat(){
        System.out.println("I eat in animal class");
    }
    public void sleep(){
        System.out.println("I Sleep in animal class");
    }
    static class bird extends animal{
        public void eat(){
            System.out.println("I eat in bird class");
        }
        public void sleep(){
            System.out.println("I sleep in bird class");
        }
        public void fly(){
            System.out.println("I fly in bird class");
        }
    }
}
class bird1 extends animal{
    public void hug(){
        System.out.println("I hug in bird1");
    }
}
public class animaloops {
    public static void main(String[] args) {
        /*animal obj = new animal();
        obj.eat();
        obj.sleep();
        animal.bird obj2 = new animal.bird();
        obj2.eat();
        obj2.sleep();
        obj2.fly();

         */
        bird1 objq = new bird1();
        objq.hug();
        objq.eat();
    }
}
