package practice3;
import java.util.Scanner;


public class leap {

	public static void leap(int year) {
		int num = year/100;
				
		if(year%4 == 0) {
			if(year%100==0) {
				if(num%4==0) {
					System.out.println(year+ " is a leap year");
				}
				else{
					System.out.println(year+ " is not a leap year");
				}
				
			}
			else {
				System.out.println(year+ " is a leap year");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = s.nextInt();
		leap(year);
		

	}
	

}
