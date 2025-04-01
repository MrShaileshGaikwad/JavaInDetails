package Multithreading;

public class ThreadTester {
	 public static void main(String[] args) {
	System.err.println("<<<<<<<<Inside main methods running>>>>>>>");
		//Thread t1 = new Thread(()->System.out.println("<<Thread is runnung>>"));
		Thread1 t1 = new Thread1();		
		t1.setDaemon(true);
		t1.start();
		System.err.println("<<<<<<<main method stopp>>>");
	}
}
