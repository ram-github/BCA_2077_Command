//Multiple Inheritance Not Supported By JAVA why??
class A{
	void show(){
		System.out.println("A");
	}
}
class B{
	void show(){
		System.out.println("B");
	}
}
class C extends A,B{
	public static void main(String a[]){
		C ob=new C();
		ob.show();
	}
}