import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String> names=new HashMap<>();
        names.put("Manpreet","Punjab");
        names.put("Abhay","Moga");
        names.put("Param","Kot ise khan");
       // names.put("Hi","Hello");
        System.out.println(names);
        System.out.println(names.get("Abhay"));
        //Collections.sort(names);
       /* Set s=names.entrySet();
        Iterator itr= s.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());*/
        for(String s: names.keySet())
        {
            System.out.println(s+ " at "+ names.get(s));
        }
    }
}
