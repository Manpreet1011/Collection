import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        HashMap<String,Integer> emp=new HashMap<>();
        emp.put("abc",1);
        emp.putIfAbsent("abc",2);
        emp.put("wer",3);
        System.out.println(emp);
        System.out.println(emp.get("abc"));
        System.out.println(emp.getOrDefault("abc", 100));
        Set<Map.Entry<String,Integer>> ent=emp.entrySet();
        Iterator<Map.Entry<String,Integer>> itr =ent.iterator();
        while(itr.hasNext()) {

            Map.Entry<String,Integer> entry=itr.next();
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
        System.out.println(emp.keySet());
        System.out.println(emp.values());
    }
//        TreeSet<Employee> list =new TreeSet<Employee>(new SortByAge());
//        list.add(new Employee("Manpreet",44));
//        list.add(new Employee("Abhay",16));
//        list.add(new Employee("Param",40));
//        //Iterator<Employee> itr=list.iterator();
//        for(Employee e : list)
//        {
//            System.out.println(e.name+ "    "+e.age);
//        }
//        System.out.println(list);
//    }
}
