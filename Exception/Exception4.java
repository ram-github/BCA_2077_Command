//Throw
class Exception4{
	public void validate() throws ArrayIndexOutOfBoundsException, ArithmeticException, NullPointerException
	{
		int c[]=new int[10];
		c[15]=12;
	}
	public static void main(String ar[])
	{
		Exception4 ob=new Exception4();
		try{
			ob.validate();
		}catch(ArithmeticException e)
		{
			System.out.println("AE Handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndex Handled");
		}
		System.out.println("Hey Where Am I?");	
	}
}


