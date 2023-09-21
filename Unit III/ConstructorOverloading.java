//Constructor Overloading
class Product{
	String name;
	int price;
	String manufacturer;
	Product(){
		
	}
	Product(String name)
	{
		
	}
	Product(String name,int price, String manufacturer){
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
		Product p3=new Product();
		Product p4=new Product("Chocopie");
	}
}
