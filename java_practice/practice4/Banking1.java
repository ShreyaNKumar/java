package practice4;

import java.util.Scanner;

abstract class BankAccount {
    String name;
    int account;
    long mobile;
    int balance;

    public BankAccount(String name, int account, long mobile) {
        this.name = name;
        this.account = account;
        this.mobile = mobile;
        balance = 1000;
    }

    public abstract void deposit(int amount);

    public abstract void withdraw(int amount);

    public abstract void display();
}

class SavingAccount extends BankAccount {
    public SavingAccount(String name, int account, long mobile) {
        super(name, account, mobile);
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("After deposit: " + balance);
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("After withdraw: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + account);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Balance: " + balance);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String name, int account, long mobile) {
        super(name, account, mobile);
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("After deposit: " + balance);
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("After withdraw: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + account);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Balance: " + balance);
    }
}

interface Interest {
    void interest1();

    void interest2();
}

class SavingsAccountInterest extends SavingAccount implements Interest {
    public SavingsAccountInterest(String name, int account, long mobile) {
        super(name, account, mobile);
    }

    public void interest1() {
        balance += (int) (balance * 0.04);
        System.out.println("Balance after 4% interest: " + balance);
    }

    public void interest2() {
        balance += (int) (balance * 0.02);
        System.out.println("Balance after 2% interest: " + balance);
    }
}

class CurrentAccountInterest extends CurrentAccount implements Interest {
    public CurrentAccountInterest(String name, int account, long mobile) {
        super(name, account, mobile);
    }

    public void interest1() {
        balance += (int) (balance * 0.04);
        System.out.println("Balance after 4% interest: " + balance);
    }

    public void interest2() {
        balance += (int) (balance * 0.02);
        System.out.println("Balance after 2% interest: " + balance);
    }
}

public class Banking1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Provide user inputs for name, account number, and mobile number
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter account number: ");
        int account = sc.nextInt();
        System.out.println("Enter mobile number: ");
        long mobile = sc.nextLong();

        SavingsAccountInterest savingsAccount = new SavingsAccountInterest(name, account, mobile);
        CurrentAccountInterest currentAccount = new CurrentAccountInterest(name, account, mobile);

        while (true) {
            System.out.println("1. Display");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Calculate 4% interest");
            System.out.println("5. Calculate 2% interest");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    savingsAccount.display();
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    savingsAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    savingsAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    savingsAccount.interest1();
                    break;
                case 5:
                    currentAccount.interest2();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}