//Default in interface
interface A{
	default void show(){
		System.out.println("A");
	}
}
interface B{
	default void show(){
		System.out.println("B");
	}
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