import java.util.Scanner;
public class Compar {
	public static void compar(int a, int b) {
		int result;
		result = a>b? a : b;
		System.out.println("the larger number is :" + result);
	}
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		compar(a,b);
		
		// TODO Auto-generated method stub
		

	}

}