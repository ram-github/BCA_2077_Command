//Method Overriding --> Runtime Polymorphism
class Example1{
	void display()
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
		Example2 ob1=new Example2();
		ob1.display();
		Example1 ob2=new Example1();
		ob2.display();
		Example1 ob3=new Example2();
		ob3.display();
	}
}