//TreeSet
import java.util.*;
public class SetEx2 {
    public static void main(String a[])
    {
        TreeSet<Integer> s=new TreeSet<>();
        s.add(1);
        s.add(1);
        s.add(10);
        s.add(15);
        s.add(10);
        System.out.println(s);
        s.remove(10);
        System.out.println(s);

        //Using Iterator
        System.out.println("Using Iterator");
        Iterator<Integer> li=s.descendingIterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
    }
}
