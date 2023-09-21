//Multiple Inheritance Supported By JAVA how??
interface A{
	void show();
}
interface B{
	void show();
}
class C implements A,B{
	public void show(){
		System.out.println("C");
	}
	public static void main(String a[]){
		C ob=new C();
		ob.show();
	}
}