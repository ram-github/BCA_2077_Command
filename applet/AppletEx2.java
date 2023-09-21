/*U can execute as follows:
	E:/> javac AppletEx1.java
	Create an html file with applet code width and height
	Open that file in a browser
*/
import java.awt.Graphics;
import java.applet.Applet;
class AppletEx2 extends Applet{
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