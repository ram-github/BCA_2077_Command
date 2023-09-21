class Array2
{
	public static void main(String kshitij[])
	{
		int arr[]=new int[6];
		arr[0]=12;
		arr[1]=12;
		arr[2]=2;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(int var:arr)
			System.out.print(var+"\t");
	}
}