public class student_detail {
    String name;
    private int age;
    int roll;

    student_detail(String name, int age) {
        this.name = name;
        this.age = age;
    }

    student_detail(String name, int roll, int age) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    //getter and setter
    public void setage(int age) {
        if (age < 0) {
            System.out.println("age -ve nhi hota hai");
            return;
        }
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public void intro() {
        System.out.println("my name is " + name + " and my age is " + age + " years");
    }

    public void sayhi(String name) {
        System.out.println(this.name + " sayhi " + name);
    }
}