//Polymorphism
//Method Overloading
class Add{
	int a,b;
	void sum()
	{
		System.out.println("Sum is: 0");
	}
	void sum(int a)
	{
		System.out.println("Sum is: "+a);
	}
	void sum(int a, float b)
	{
		System.out.println("Sum is: "+(a+b));
	}
	public static void main(String a[])
	{
		Add obj1=new Add();
		Add obj2=new Add();
		Add obj3=new Add();
		obj1.sum();
		obj2.sum((int)5.5,10.0f);
		obj3.sum(5);
	}
}