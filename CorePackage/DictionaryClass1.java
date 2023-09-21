/*
In Java, Dictionary is the list of key-value pairs. Its abstract class.
*/
import java.util.*;
class DictionaryClass1
{
public static void main(String args[])  
	{  
		//creating a dictionary  
		Dictionary dict = new Hashtable();  
		System.out.println("Is the dictionary empty? \n"+dict.isEmpty());  
		//prints the size of the dictionary  
		System.out.println("The size of the dictionary is: "+dict.size()); 
		//adding values in the dictionary  
		dict.put(101, "Sydney");  
		dict.put(108, "Canberra"); 
		
		dict.put(106, "Mount Gambier"); 
		System.out.println("Is the dictionary empty? \n"+dict.isEmpty());  
		//gets the value of the specified key  
		System.out.println("The value of the specified key is: "+dict.get(103));   
		dict.put(104, "Perth");  
		dict.put(102, "Brisbane");  
		dict.put(101, "Brisbane"); 
		//gets the value of the specified key  
		System.out.println("The value of the specified key is: "+dict.get(104));  
		//removes the corresponding value of the specified key  
		System.out.println("The removed value is: "+dict.remove(106)); 
		//prints the size of the dictionary  
		System.out.println("The size of the dictionary is: "+dict.size()); 

		System.out.println("the dictionary is: "+dict); 
	 
	}  
}