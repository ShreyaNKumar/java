package practice2;
import java.util.Scanner;


public class LCM {
	private static Scanner s;
	public static void lcm(int a, int b) {
		int lcm = (a>b)?a:b;
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				System.out.println("The LCM of " + a + " and " + b +" is " + lcm);
			break;
			}
			
				++lcm;
			
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		System.out.println("Enter two numbers :"); 
		int a = s.nextInt();
		int b = s.nextInt();
		lcm(a,b);

	}

}
