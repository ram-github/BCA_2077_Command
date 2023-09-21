//Final with Method --> No overriding
class Example1{
	final void display()
	{
		System.out.println("Display Method - Example1");	
	}
}
class Example2 extends Example1{
	void display()
	{
		System.out.println("Display Method - Example2");		
	}
	public static void main(String a[])
	{
		
	}
}