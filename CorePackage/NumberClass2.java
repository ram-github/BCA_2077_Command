/*
java.lang.Number: provides numeric wrapper sub classes under the abstract class Number present in 
java.lang.containg six sub-classes: Byte, Long, Integer, Short, Float, Double.
Method 1: type typeValue
Method 2: compareTo returns 0, -1, 1 
Method 3: equals returns true if arg is not null and is an object of same type 
and with same numeric value, 
otherwise false.
Method 4:parseInt(string, radix):get primitive type of a string, radix can be 10, 16, 8, 2
Method 6:parseFloat(string)
Method 5: toString represent any object as a string, toString() method comes into existence
*/

class NumberClass2
{
	public static void main(String ar[])
	{
		Integer i=new Integer("10");
		Integer ii=new Integer("10");
		System.out.println(i.compareTo(ii));
		System.out.println(i.compareTo(7));
		System.out.println(i.compareTo(10));
		System.out.println(i.compareTo(15));
		
		int n=15;
		System.out.println(i.compareTo(n));
		n=10;
		System.out.println(i.compareTo(n));
		
		short s=10;
		byte b=10;
		System.out.println(i.equals(n));
		System.out.println(i.equals(10));
		System.out.println(i.equals(s));
		System.out.println(i.equals(b));
		
		System.out.println(Float.parseFloat("99"));
		System.out.println(Integer.parseInt("16",16));
		System.out.println(Integer.parseInt("11",8));
		System.out.println(Integer.parseInt("1001",2));
		
		System.out.println(i.toString());
	}
}