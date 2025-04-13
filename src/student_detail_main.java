public class student_detail_main {
        public static void main(String[] args) {
            System.out.println("hello");
            student_detail s1=new  student_detail("a",12);
            //s1.setage(-34);
            System.out.println(s1.getage());
        }
        static {
            System.out.println("i m a static block in a main");
        }
}