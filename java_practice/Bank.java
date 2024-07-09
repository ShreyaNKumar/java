public class Bank {
	  
	  int balance;
	  
	  public Bank(int initialBalance){
	    balance = initialBalance;
	  }
	  
	  public void checkBalance(){
	    System.out.println("Hello!");
	    System.out.println("Your balance is "+ balance);
	  }
	  public void deposit(int amountToDeposit){
	    balance = balance + amountToDeposit;
	    System.out.println("You just deposited "+ amountToDeposit);
	  }

	  public int withdraw(int amountToWithdraw){
	    balance = balance - amountToWithdraw;
	    return amountToWithdraw;
	  }

	  public static void main(String[] args){
	    Bank savings = new Bank(2000);
	    
	    //Check balance:
	    savings.checkBalance();

	    //Withdrawing:
	    System.out.println("You just withdrew "+ savings.withdraw(300));
	    
	    //Check balance:
	    savings.checkBalance();
	    
	    //Deposit:
	    savings.deposit(600);
	    
	    //Check balance:
	    savings.checkBalance();
	    
	    //Deposit:

	    savings.deposit(600);
	    
	    //Check balance:
	   savings.checkBalance();
	    
	  }       
	}

