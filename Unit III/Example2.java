//Instance Variable and Class Variable
class Product{
	String name;
	int price;
	static  String manufacturer;
	static void getManufacturer(String m)
	{
		manufacturer=m;
	}
	void getDetails(String n,int p){
		name=n;
		price=p;
	}
	void printDetails(){
		System.out.println("Name: "+name+" Price: "+price+" Manufacturer: "+manufacturer);
	}
	public static void main(String a[])
	{
		Product p1=new Product();
		getManufacturer("CG");
		p1.getDetails("Waiwai",20);
		p1.printDetails();
		Product p2=new Product();
		p2.getDetails("kwiks",10);
		p2.printDetails();
	}
}
