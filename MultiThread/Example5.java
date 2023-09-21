//join operation
class MThread extends Thread{
	public void run(){
		for(int i=0;i<5;i++)
		{
			try{
				Thread.sleep(1500);
			}
			catch(InterruptedException e){
				
			}
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}
class Example5{
	public static void main(String a[]){
		MThread thread1=new MThread();
		thread1.start();
		try{
			thread1.join();
		}catch(InterruptedException e){
			System.out.println("Exception Handled");
		}
		MThread thread2=new MThread();
		thread2.start();
		try{
			thread2.join();
		}catch(InterruptedException e){
			System.out.println("Exception Handled");
		}
		MThread thread3=new MThread();
		thread3.start();
	}
}