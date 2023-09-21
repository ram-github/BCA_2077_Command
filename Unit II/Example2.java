//Example
/*
* * * *
  * * *
    * *
	  *
*/
class Example2{
	public static void main(String a[])
	{
		for(int i=4;i>=1;i--)
		{
			for(int k=4;k>=i;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}