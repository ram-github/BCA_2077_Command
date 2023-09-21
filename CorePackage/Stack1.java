/*
In Java, Stack is a class that falls under the Collection framework that extends the Vector class. 
It represents the LIFO stack of objects. Before using the Stack class, we must import the java.util 
package
Methods:
push: inserts item into stack
pop: returns the item deleted
peek: returns top of stack
empty: returns true or false 
search: returns positiion from top of stock else -1
*/
import java.util.Stack;  
public class Stack1  
{  
    public static void main(String[] args)   
    {  
        Stack<Integer> stk= new Stack<>();  
        boolean result = stk.empty();  
        System.out.println("Is the stack empty? " + result);  
        stk.push(78); 
        System.out.println("Stack Top? " + stk.peek());   
        stk.push(113);  
        stk.push(90);  
        stk.push(120);
        System.out.println("Stack Top? " + stk.peek()); 
        System.out.println("Stack POP? " + stk.pop()); 
        System.out.println("Stack Top? " + stk.peek());
        System.out.println("Elements in Stack: " + stk);  
        result = stk.empty();  
        System.out.println("Is the stack empty? " + result); 
        System.out.println("Stack Search for 90? " + stk.search(113)); 
    }  
}  