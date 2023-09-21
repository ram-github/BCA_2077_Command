//synchronized
class Display{
	synchronized public void display_number(int n){
		for(int i=0;i<n;i++){
			try{
				Thread.sleep(10);
			}
			catch(InterruptedException e){
				
			}
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}
class MThread2 extends Thread{
	Display d;
	MThread2(Display d){
		this.d=d;
	}
	public void run(){
		d.display_number(5);
	}
}
class MThread1 extends Thread{
	Display d;
	MThread1(Display d){
		this.d=d;
	}
	public void run(){
		d.display_number(10);
	}
}
class Example7{
	public static void main(String a[]){
		Display obj=new Display();
		MThread1 thread1=new MThread1(obj);
		MThread2 thread2=new MThread2(obj);
		thread1.start();
		thread2.start();
	}
}