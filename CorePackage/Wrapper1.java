/*
Wrapper class: A class whose object wraps or contains a primitive data types. 
The wrapper class in Java provides the mechanism to convert primitive into object and 
object into primitive.
Primitve types -> Wrapper Class
char->Character
byte->Byte
short->Short
int->Integer
long->Long
float->Float
double->Double
bool->Boolean
Java is an object-oriented programming language, so we need to deal with objects many times 
like in Collections, Serialization, Synchronization, java.util package, change the value 
in method etc. 
*/
import java.util.ArrayList;
class Wrapper1
{
	public static void main(String ar[])
	{
		char ch='a';
		Character chh=ch;		//Autoboxing: primitive to object types of corresponding wrapper classes
		System.out.println(chh);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(25);				//Autoboxing
		System.out.println(al.get(0));
		
		Character cu='a';		
		char chu=chh;			//Unboxing
		System.out.println(chu);
		
		ArrayList<Integer> all=new ArrayList<Integer>();
		all.add(25);				//Autoboxing
		int num=all.get(0);		//Unboxing
		System.out.println(num);
		
	}
}