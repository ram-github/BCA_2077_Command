//Extending Thread Class
class MThread extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}
class Example2{
	public static void main(String a[]){
		MThread thread1=new MThread();
		thread1.start();
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}