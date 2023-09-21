//Implementing Runnable Interface
class MThread implements Runnable{
	public void run(){
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}
class Example3{
	public static void main(String a[]){
		MThread obj=new MThread();
		Thread thread1=new Thread(obj);
		thread1.start();
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}