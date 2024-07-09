package practice3;
import java.util.Scanner;

public class Table {
	private static Scanner s;
	public static void digits(int num) {
		int digit = 0 ;
		if(num!=0) {
		while(num != 0)
		{
			//pick last digit of the number and count one by one
			int pick_last = num % 10;
			digit++;
			num = num / 10;
		}
		}
		else {
			digit = 1;
		}
		

		//display number of digits
		System.out.print("Number of Digits = "+digit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = s.nextInt();
		digits(num);


	}

}
