package practice4;
import java.util.*;
//class MyThread extends Thread{
//	public void run() {
//		for(int i=1;i<=10;++i) {
//			System.out.println("Child Thread");
//		}
//	}
//}
//class Thread1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MyThread t = new MyThread();
//		//Thread t2 = new Thread(new MyThread());
//		t.start();
//		for(int i=1;i<=10;++i) {
//			System.out.println("Main thread");
//		}
//		
//
//	}
//
//}




//what algorithms does the thread scheduler use ?

//class Thread1 extends Thread{
//	public void run() {
//		System.out.println("Inside run method");
//	}
//	public static void main(String[] args) {
//		Thread1 t1 = new Thread1();
//		Thread1 t2 = new Thread1();
//		Thread1 t3 = new Thread1();
//		System.out.println("t1 thread priority: " + t1.getPriority());
//		System.out.println("t2 thread priority: " + t2.getPriority());
//		System.out.println("t3 thread priority: " + t3.getPriority());
//		t1.setPriority(2);
//		t2.setPriority(5);
//		t3.setPriority(8);
//		System.out.println("t1 thread priority: " + t1.getPriority());
//		System.out.println("t2 thread priority: " + t2.getPriority());
//		System.out.println("t3 thread priority: " + t3.getPriority());
//		
//	}
//}

//2 ways of handling exception
//1st: try catch method
//class Thread1{
//	public static void main(String[] args) {
//		try {
//		for(int i=1; i<10;i++){
//			System.out.println(i);
//			Thread.sleep(400);
//		}
//		}
//		catch(Exception e) {}
//	}
//}

//2nd: throws keyword
//class Thread1{
//	public static void main(String[] args) throws InterruptedException {
//		
//		for(int i=1; i<10;i++){
//			System.out.println(i);
//			Thread.sleep(400);
//		}
//		
//	}

//}

//Thread interruption
//class MyThread extends Thread{
//	public void run() {
//
//		try {
//			for(int i=1; i<5;i++){
//				System.out.println("Child thread");
//				Thread.sleep(1000);
//			}
//			}
//		catch(InterruptedException e) {
//				System.out.println("InterruptedException has occurred");
//			}
//	}
//}
//
//class Thread1 {
//
//	public static void main(String[] args) throws  InterruptedException{
//		// TODO Auto-generated method stub
//		MyThread t = new MyThread();
//		//Thread t2 = new Thread(new MyThread());
//		t.start();
//		t.interrupt();
//		for(int i=1;i<=5;++i) {
//			System.out.println("Main thread");
//			Thread.sleep(1000);
//		}
//		
//
//	}
//
//}

//runnable interface is the best way to create a thread
class A
{
	public static synchronized void print(String name) {
		for(int i=0;i<3;i++) {
			System.out.println("Batting= "+name);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}

class MyThread0 extends Thread
{
	public void run() {
		A.print("Sachin");
	}
	
}
class MyThread2 extends Thread
{
	public void run() {
		A.print("Dhoni");
	}
	
}
class MyThread3 extends Thread
{
	public void run() {
		A.print("Virat");
	}
	
}
class Thread1{
	public static void main(String[] args) {
		new MyThread0().start();
		new MyThread2().start();
		new MyThread3().start();
	}
}
