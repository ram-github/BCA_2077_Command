class Array3
{
	public static void main(String kshitij[])
	{
		int[][] arr=new int[2][3];
		for(int i=0;i<arr.length;i++)	
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=1;
			}
		}
		for(int i=0;i<arr.length;i++)	
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}