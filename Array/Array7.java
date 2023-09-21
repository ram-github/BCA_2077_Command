//WAP to input a 3*3 matrix and display the sum of odd elements.
import java.util.Scanner;
class Array7
{
	public static void main(String kshitij[])
	{
		int[][] arr;
		int s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows and cols of matrix: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		arr=new int[r][c];
		for(int i=0;i<arr.length;i++)	
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the matrix elements: ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)	
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]%2==1)
					s=s+arr[i][j];
			}	
		}
		System.out.println("Sum is: "+s);
	}
}