//Instance Variable
class Product{
	String name;
	int price;
	String manufacturer;
	void getDetails(String n,int p, String m){
		name=n;
		price=p;
		manufacturer=m;
	}
	void printDetails(){
		System.out.println("Name: "+name+" Price: "+price+" Manufacturer: "+manufacturer);
	}
	public static void main(String a[])
	{
		Product p1=new Product();
		p1.getDetails("Waiwai",20,"CG");
		p1.printDetails();
		Product p2=new Product();
		p2.getDetails("kwiks",10,"CG");
		p2.printDetails();
	}
}
