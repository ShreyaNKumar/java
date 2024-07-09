package practice2;
import java.util.Scanner;


public class HCF {
	private static Scanner s;
	
	public static void hcf(int a, int b) {
		int hcf=0 , i;
		for(i=1; i<=a&&i<=b; i++) {
			if(a%i==0 && b%i==0) {
				hcf = i;
			}
			
		}
		System.out.println("GCD of " + a + " and " + b +" is " + hcf);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		int a = s.nextInt();
		int b = s.nextInt();
		hcf(a,b);

	}

}

