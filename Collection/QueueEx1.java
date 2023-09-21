import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

//Queue Interface
public class QueueEx1 {
    public static void main(String a[])
    {
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(16);
        q.offer(4);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        q.poll();
        System.out.println(q);

        //Using Iterator
        System.out.println("Using Iterator");
        Iterator<Integer> li=q.iterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
    }
}
