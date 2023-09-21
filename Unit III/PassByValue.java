//PassByValue
class PassByValue{
	static void increment(int x)
	{
		x++;
		System.out.println("Value of x: "+x);
	}
	public static void main(String ar[])
	{
		int x=5;
		System.out.println("Value of x: "+x);
		increment(x);
		System.out.println("Value of x: "+x);
		
	}
}