class Example1{
	public static void main(String a[]){
		for(int i=0;i<5;i++)
		{
			System.out.print(i+" "+Thread.currentThread().getName()+" ");
			System.out.println("Priority: "+Thread.currentThread().getPriority());
		}
	}
}