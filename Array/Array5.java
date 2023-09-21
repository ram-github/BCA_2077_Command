//Jagged Array
class Array5
{
	public static void main(String kshitij[])
	{
		int[][] arr=new int[3][];
		arr[0]=new int[1];
		arr[1]=new int[3];
		arr[2]=new int[2];
		for(int i=0;i<arr.length;i++)	
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=1;
			}
		}
		for(int a[]:arr)	
		{
			for(int j:a)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}