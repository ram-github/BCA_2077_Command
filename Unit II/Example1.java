//Example
/*
U
UN
UNI
UNIV
*/
class Example1{
	public static void main(String a[])
	{
		char[] arr={'U','N','I','V','E','R'};
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		
	}
}