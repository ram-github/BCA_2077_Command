/*
java.lang.Number: provides numeric wrapper sub classes under the abstract class Number present in 
java.lang. containg six sub-classes: Byte, Long, Integer, Short, Float, Double.
Method 1: type typeValue
*/
class NumberClass1
{
	public static void main(String ar[])
	{
		Double d=new Double("6.9867");
		byte b=d.byteValue();
		short s=d.shortValue();
		int i =d.intValue();
		long l=d.longValue();
		float f=d.floatValue();
		double d1=d.doubleValue();
		System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d1);
		Integer ii=new Integer("1002");
		byte bb=ii.byteValue();
		System.out.println(bb);
	}
}