package Projects;
import java.util.Scanner;


class atmFunc{
	
	public void menu() {
		
		System.out.println("***MENU***");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Check Balance\n2. Withdraw\n3. Deposit\n4. Exit\nEnter choice: ");
		int choice = sc.nextInt();
		
		if(choice==1) {
			checkBalance();
		}
		else if(choice==2) {
			System.out.println("Enter amount to withdraw: ");
			int wd = sc.nextInt();	
			Withdraw(wd);
		}
		else if(choice==3) {
			System.out.println("Enter amount to deposit: ");
			int dp = sc.nextInt();
			Deposit(dp);
		}
		else if(choice==4) {
			Exit();
		}
		else if(choice > 4 || choice<1) {
			System.out.println("Invalid Choice");
		}
	}
	
	public int Balance=0;
	
	public void checkBalance() {
		System.out.println(Balance);
		menu();
	}
	
	public void Withdraw(int wd) {
		
		if(wd>Balance) {
			System.out.println("Insufficient amount of money in the account");
		}
		else {
		    Balance = Balance - wd;
		    System.out.println("Done!");
		    System.out.println("Current balance: " + Balance);
		    
		}
		menu();
	}
	
	public void Deposit(int dp) {
		Balance = Balance + dp;
		System.out.println("Done!");
		System.out.println("Current balance: " + Balance);
		menu();
	}
	
	public void Exit() {
		System.out.println("Thank You!");
	}
	
}


class atm {

	public static void main(String[] args) {
		
		atmFunc Menu = new atmFunc();
		Menu.menu();
	}

}
