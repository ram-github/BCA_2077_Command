import java.util.LinkedList;

//LinkedList: Implements List Interface
import java.util.*;
public class ListEx3 {
    public static void main(String a[])
    {
        LinkedList<Integer> list1=new LinkedList<>();
        list1.add(1);           //1
        list1.addFirst(10);     //10,1
        list1.addLast(20);         //10,1,20
        list1.addFirst(5);          //5,10,1,20
        System.out.println(list1);       //5,10,1,20
        list1.removeFirst();                //10,1,20
        System.out.println(list1);       //10,1,20
        
          //Using Iterator
          System.out.println("Using Iterator");
          ListIterator li=list1.listIterator();
          while(li.hasNext())
          {
              System.out.println(li.next());
          }
  
          //Using For Loop
          System.out.println("Using For loop");
          for(int i:list1)
          {
              System.out.println(i);
          }

    }
    
}
