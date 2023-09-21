//This Keyword --> Call a constructor
class Product{
	String name;
	int price;
	String manufacturer;
	Product(){
		System.out.println("Hey I am being Called? How??");
	}
	Product(String name,int price, String manufacturer){
		this();		//call the constructor
		this.name=name;
		this.price=price;
		this.manufacturer=manufacturer;
	}
	void printDetails(){
		System.out.println("Name: "+name+" Price: "+price+" Manufacturer: "+manufacturer);
	}
	public static void main(String a[])
	{
		Product p1=new Product("Waiwai",20,"CG");
		p1.printDetails();
		Product p2=new Product("kwiks",10,"CG");
		p2.printDetails();
	}
}
