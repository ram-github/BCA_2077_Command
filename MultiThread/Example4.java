class Example4{
	public static void main(String a[]){
		
		System.out.println("Current Thread: "+Thread.currentThread());
		System.out.println("Current Thread Name: "+Thread.currentThread().getName());	
		System.out.println("Current Thread: "+Thread.currentThread().getPriority());
		
		Thread.currentThread().setName("Prakash");
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		System.out.println("Current Thread: "+Thread.currentThread());
		System.out.println("Current Thread Name: "+Thread.currentThread().getName());	
		System.out.println("Current Thread: "+Thread.currentThread().getPriority());
				
	}
}