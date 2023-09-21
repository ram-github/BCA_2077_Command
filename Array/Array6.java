//WAP to input a 3*3 matrix and display the diagonal elements.
import java.util.Scanner;
class Array6
{
	public static void main(String kshitij[])
	{
		int[][] arr=new int[3][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)	
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the matrix elements: ");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Obtained Matrix is: ");
		for(int i=0;i<arr.length;i++)	
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Diagonal elements are");
		for(int i=0;i<arr.length;i++)	
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
					System.out.print(arr[i][j]+"\t");
			}
		}
		
	}
}