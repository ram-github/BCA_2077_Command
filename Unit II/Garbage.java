//Garbage Collection
class Garbage
{
	public void finalize()
	{
		System.out.println("Destroying...");
	}
	public static void main(String ar[])
	{
		Garbage s1=new Garbage();
		Garbage s2=new Garbage();
		s1=null;
		s2=null;
		System.gc();
	}
}