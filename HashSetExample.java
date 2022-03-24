import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> name=new HashSet<String>();
        name.add("Manpreet");
        name.add("Abhay");
        name.add("Param");
        name.add("Manpreet1");
        System.out.println(name);
        Iterator itr=name.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println(name.size());
        for(String s:name)
            System.out.println(s);
    }
}
