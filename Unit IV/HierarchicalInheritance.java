//Hierarchical Inheritance
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
}
class C extends A{
	void display_C()
	{
		System.out.println("Display Method of C");
	}
	public static void main(String a[])
	{
		C ob=new C();
		ob.display_C();
		ob.display_A();
		B obb=new B();
		obb.display_B();
		obb.display_A();
	}
}