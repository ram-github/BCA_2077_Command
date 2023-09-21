//Super Keyword Usage
class Example1{
	String name;
	Example1(){
		
	}
	Example1(String name){
		this.name=name;
	}
	void display()
	{
		System.out.println("I am called using super");
	}
}
class Example2 extends Example1{
	int price;
	Example2(String name, int price){
		super(name);				//to invoke super class relevant constructor
		this.price=price;
	}
	void show()
	{
		System.out.println("Price: "+price);
		System.out.println("Name: "+super.name);		//to access immediate super class instance variable
		super.display();		//to invoke immediate super class method
	}
	public static void main(String a[])
	{
		Example2 ob1=new Example2("waiwai",20);
		ob1.show();
	}
}