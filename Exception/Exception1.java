
class Exception1{
	public static void main(String ar[])
	{
		System.out.println("Hello");
		System.out.println("How");
		int a=5,b=0;
		try{
			int c=a/b;
		}
		catch(ArithmeticException e){
			System.out.println("Hey I just handled an exception");
		}
		System.out.println("Are");
		System.out.println("You?");
	}
}


