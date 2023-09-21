//Throw
class Exception3{
	public void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("Sorry Grow Up!");
		else
			System.out.println("Well ! You can Vote");	
	}
	public static void main(String ar[])
	{
		int a=10;
		Exception3 ob=new Exception3();
		try{
			ob.validate(a);
		}catch(ArithmeticException e)
		{
			System.out.println("Handled "+e);	
		}
		System.out.println("Hey Where Am I?");	
	}
}


