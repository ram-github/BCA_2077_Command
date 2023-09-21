//Stack Class: implements list interface
import java.util.*;
public class ListEx2 {
    public static void main(String a[])
    {
        Stack<Integer> stack1=new Stack<>();        //Generic Class
        stack1.push(1);
        stack1.push(10);
        stack1.push(10);
        System.out.println("Top of Stack is: "+stack1.peek());
        stack1.push(20);
        System.out.println("Top of Stack is: "+stack1.peek());
        stack1.pop();
        System.out.println("Top of Stack is: "+stack1.peek());
        System.out.println("Top of Stack is: "+stack1);

         //Using Iterator
         System.out.println("Using Iterator");
         ListIterator li=stack1.listIterator();
         while(li.hasNext())
         {
             System.out.println(li.next());
         }
 
         //Using For Loop
         System.out.println("Using For loop");
         for(int i:stack1)
         {
             System.out.println(i);
         }
    }
}
