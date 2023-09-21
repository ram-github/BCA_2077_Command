//ThisKeyword --> access the instance variable
class ThisKeywordExample
{
	String name;
	void getDetails(String name){
		this.name=name;
	}
	void printDetails(){
		System.out.println("Name: "+name);
	}
	public static void main(String a[])
	{
		ThisKeywordExample ex1=new ThisKeywordExample();
		ex1.getDetails("Niraj");
		ex1.printDetails();
		ThisKeywordExample ex2=new ThisKeywordExample();
		ex2.getDetails("Saroj");
		ex2.printDetails();
	}
}