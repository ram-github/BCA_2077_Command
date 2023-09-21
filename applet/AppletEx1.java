/*U can execute as follows:
	E:/> javac AppletEx1.java
	E:/> appletviewer AppletEx1
*/
import java.awt.Graphics;
import java.applet.Applet;
class AppletEx1 extends Applet{
	public void init(){
		System.out.println("Init Called only once at start");
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome to Applet Programming",100,80);
	}
	public void start(){
		System.out.println("Called after browser is maximized");
	}
	public void stop(){
		System.out.println("Called after browser is minimized ");
	}
	public void destroy(){
		System.out.println("Called after browser is closed");
	}
}
/*
	<applet code="AppletEx1" width="300" height="400">
	</applet>
*/