
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.ListIterator;

public class ListEx1 {
    public static void main(String a[])
    {
        List<Integer> list1=new LinkedList<>();    //Generic
        list1.add(0,1);
        list1.add(1,10);
        list1.add(2,20);
        list1.add(3,10);
		list1.add(40);
        System.out.println(list1);

        List<Integer> list2=new ArrayList<>();
        list2.add(0,5);
        list2.addAll(list1);
        System.out.println(list2);

        list2.remove(0);
        System.out.println(list2);

        //Using Iterator
        System.out.println("Using Iterator in forward direction");
        ListIterator li=list1.listIterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
		
		System.out.println("Using Iterator in reverse direction");
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }

		//Sorting List1
		Collections.sort(list1);
        //Using For Loop 
        System.out.println("Using For loop");
        for(int i:list1)
        {
            System.out.println(i);
        }
		
		System.out.println("searching Result: "+list1.contains(10));
		System.out.println("searching Result: "+list1.indexOf(10));
		System.out.println("searching Result: "+list1.lastIndexOf(100));
		System.out.println("Items at particular index: "+list1.get(3));

    }

}
