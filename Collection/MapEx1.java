//TreeMap: implements map interface
import java.util.*;
public class MapEx1 {
  public static void main(String ar[])
    {
        Map<Integer,String> m=new TreeMap<>();
        m.put(98,"Nepal");
        m.put(99,"USA");
        m.put(98,"Pakistan");
        m.put(1002,"China");
        System.out.println(m);
		System.out.println("Entries : "+m.size());

        m.remove(1002);
        System.out.println(m);
		System.out.println("Search China : "+m.containsValue("China"));

        //Using Iterator
        Set st=m.entrySet();
        Iterator itr=st.iterator();
        while(itr.hasNext())
        {
            Map.Entry me=(Map.Entry)itr.next();
            System.out.println("Key: "+me.getKey()+" Values: "+me.getValue());
        }
    }
}
