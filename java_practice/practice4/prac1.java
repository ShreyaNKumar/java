package practice4;
import java.util.Scanner;

public class prac1{
	
	prac1(int num) {
		if(num%4==0) {
			System.out.println("4 x " + num/4 + " = " + num);
		}
		else {
			System.out.println(num + " is not a multiple of 4. ");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		prac1 divbyfour = new prac1(num);
		
		
	}
	
}