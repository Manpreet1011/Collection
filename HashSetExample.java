import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> i = new HashSet<Student>(50);
        i.add(new Student("Abhay", 16));
        i.add(new Student("Manpreet", 16));
//        i.add(3);
//        i.add(2);
//        i.add(23);
        System.out.println(i);

//        System.out.println(name);
//        Iterator itr=name.iterator();
//        while(itr.hasNext())
//            System.out.println(itr.next());
//        System.out.println(name.size());
//        for(String s:name)
//            System.out.println(s);
    }
}
