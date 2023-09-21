//Hybrid Inheritance
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
class C extends B{
	void display_C()
	{
		System.out.println("Display Method of C");
	}
}
class D extends B{
	void display_D()
	{
		System.out.println("Display Method of D");
	}
	public static void main(String a[])
	{
		C ob=new C();
		ob.display_C();
		ob.display_A();
		ob.display_B();
		D obb=new D();
		obb.display_D();
		obb.display_A();
		obb.display_B();
	}
}