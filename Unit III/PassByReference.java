//PassByReference
class Point{
	int x,y;
	void change(Point p)
	{
		p.x=1;
		p.y=2;
	}
	public static void main(String ar[])
	{
		Point p=new Point();
		p.x=0;
		p.y=1;
		System.out.println("Value of x: "+p.x+" Value of y: "+p.y);
		p.change(p);
		System.out.println("Value of x: "+p.x+" Value of y: "+p.y);		
	}
}