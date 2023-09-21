//Recursion
class Recursion{
	int fibo(int num)
	{
		if(num==0)
			return 4;
		else if(num==1)
			return 5;
		else
			return fibo(num-1)+fibo(num-2);
	}
	public static void main(String ar[])
	{
		int a=5;
		Recursion r=new Recursion();
		for(int i=0;i<a;i++)
		{
			System.out.print(r.fibo(i)+" ");
		}
	}
	
}