import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> x=new ArrayList<Integer>();
        Scanner read=new Scanner(System.in);
        for (int i=0;i<10;i++)
        {
            System.out.println("Enter element number :"+i);
            x.add(read.nextInt());
        }
        System.out.println(x.size());
        Iterator<Integer> itr= x.iterator();
        while(itr.hasNext())
        {
            int i=itr.next();
            if(i>=5)
                itr.remove();
        }
        System.out.println(x);

    }
}
