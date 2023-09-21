//Single Inheritance
class A{
	void display_A()
	{
		System.out.println("Display Method of A");
	}
}
class B extends A{
	void display_B()
	{
		System.out.println("Display Method of B");
	}
	public static void main(String a[])
	{
		B ob=new B();
		ob.display_A();
		ob.display_B();
	}
}