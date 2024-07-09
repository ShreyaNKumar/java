package practice3;
import java.util.Scanner;

//abstract class Test{
//	abstract void m1();
//	abstract void m2();
//	abstract void m3();
//	void m4() {
//		System.out.println("Non abstract method m4");
//	}
//}
//class Abstraction extends Test{
//	void m1() {
//		System.out.println("abstract method m1");
//	}
//	void m2() {
//		System.out.println("abstract method m2");
//	}
//	void m3() {
//		System.out.println("abstract method m3");
//	}
//	public static void main(String[] args) {
//		Abstraction obj = new Abstraction();
//		//(or) Test obj = new Abstraction();
//		
//		obj.m1();
//		obj.m2();
//		obj.m3();
//		obj.m4();
//		
//	}
//	
//}


//abstract class Bank {
//    abstract void checkBalance();
//    abstract void deposit(int deposit);
//    abstract void withdraw(int withdraw);
//    
//    void exit() {
//        System.out.println("Thank you !");
//    }
//}
//
//public class Abstraction extends Bank {
//    int balance = 0;
//    
//    void checkBalance() {
//        System.out.println("The current balance is " + balance);
//    }
//    
//    void deposit(int deposit) {
//        balance = balance + deposit;
//        System.out.println("Deposit done.");
//        System.out.println("The current balance is " + balance);
//    }
//    
//    void withdraw(int withdraw) {
//        if (withdraw <= balance) {
//            balance = balance - withdraw;
//            System.out.println("Withdrawal done.");
//        } else {
//            System.out.println("Insufficient balance.");
//        }
//        System.out.println("The current balance is " + balance);
//    }
//    
//    public static void main(String[] args) {
//        Abstraction bank = new Abstraction();
//        bank.checkBalance();
//        bank.deposit(1000000);
//        bank.withdraw(9000);
//        bank.exit();
//    }
//}




//Interface

//interface func{
//	void func1(int a, int b);
//}
//
//class Abstraction implements func {
//	
//	public void func1(int a, int b) {
//		int sum = a + b;
//		System.out.println(sum);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Abstraction obj = new Abstraction();
//		obj.func1(10, 8);
//
//	}
//
//}






//Multiple Inheritance

interface first{
	default void show() {
		System.out.println("first");
	}
}


interface child1 extends first{
	void display();
}

interface child2 extends first{
	void print();
}

public class Abstraction implements child1, child2{
	
	public void display(){
		System.out.println("child 1");
	}
	
	public void print(){
		System.out.println("child 2");
	}
	
	
	public static void main(String[] args) {
		
		Abstraction obj = new Abstraction();
		obj.show();
		obj.display();
		obj.print();
		
		
		
	}
}



