//Write an application that accepts two doubles as its command line arguments, multiple these together and display the product.
class QN10
{
	public static void main(String a[])
	{
		double d1= Double.parseDouble(a[0]);
		double d2=Double.parseDouble(a[1]);
		double d3=d1*d2;
		System.out.println(d3);
	}
}