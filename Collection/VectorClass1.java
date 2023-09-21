/*
Vector is like the dynamic array which can grow or shrink its size. 
Methods:
size()
capacity()
add(object)
addElement(object)
remove(int index)
indexOf(object)
firstElement()
lastElement()
contains(object)
*/
import java.util.*;  
public class VectorClass1 {  
       public static void main(String args[]) {  
          //Create an empty vector with initial capacity 4  
          Vector<String> vec = new Vector<String>(4);  
		  //Check size and capacity  
          System.out.println("Size is: "+vec.size());  
          System.out.println("Default capacity is: "+vec.capacity()); 
          //Adding elements to a vector  
          vec.addElement("Tiger");  
          vec.add("Lion");  
          vec.add("Dog");  
		  vec.add("Elephant"); 
		  vec.add("Elephant"); 
          vec.add("Elephant");  
          //Check size and capacity  
          System.out.println("Size is: "+vec.size());  
          System.out.println("Default capacity is: "+vec.capacity());  
          //Display Vector elements  
          System.out.println("Vector element is: "+vec);  
          vec.add("Rat");  
          vec.addElement("Cat");  
          vec.addElement("Deer");  
          //Again check size and capacity insertions  
          System.out.println("Size after addition: "+vec.size());  
          System.out.println("Capacity after addition is: "+vec.capacity());  
		   System.out.println("Remove element at index 4: " +vec.remove(4));  
          //Display Vector elements again  
          System.out.println("Elements are: "+vec);  
          //Checking if Tiger is present or not in this vector         
            if(vec.contains("Tiger"))  
            {  
               System.out.println("Tiger is present at the index " +vec.indexOf("Tiger"));  
            }  
            else  
            {  
               System.out.println("Tiger is not present in the list.");  
            }  
            //Get the first element  
          System.out.println("The first animal of the vector is = "+vec.firstElement());   
          //Get the last element  
          System.out.println("The last animal of the vector is = "+vec.lastElement());   
       }  
}  