package DP;
import java.lang.Thread;
public class singletonthread{

	private static singletonthread instance;
	private Singletonthread() {
		super();
	}
	public static singletonthread getInstance() {
		if (instance == null)
			synchronized(singletonthread.class) {
				if (instance == null)
					instance =new singletonthread();
			}
		return instance;
	}
	public static void main(String[] args) {
		Runnable r = () -> System.out.println(singletonthread.getInstance());
		Thread tr = new Thread(r);
		Thread tr1 = new Thread(r);
		tr.start();
		tr1.start();
		System.out.println(singletonthread.getInstance());
			}
	
}
