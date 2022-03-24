import java.io.Serializable;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Student> l=new ArrayList<>();
        List<Student> l1=new ArrayList<>();
        l.add(new Student("Manpreet",44));
        l.add(new Student("Abhay",16));
        l.add(new Student("Param",40));
        Collections.sort(l);
        for(Student s:l)
        {
            System.out.println(s);
        }
        Iterator i=l.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());


        }

    }
}
