import java.util.*;
public class HashMapimplement {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("Vivek","Student");
        m.put("Abhishek","Student");
        m.put("Brajesh","Instructor");
        System.out.println(m);
        m.putIfAbsent("Anurag","Student");
        m.putIfAbsent("Abhishek","Student");
        System.out.println(m.containsKey("Abhishek"));
        System.out.println(m.containsValue("Student"));
        System.out.println(m.get("Brajesh"));
        m.remove("Anurag");
        m.clear();
        System.out.println(m);
    }
}
