package practice2;
import java.util.Scanner;

//import practice.String;
public class Char {
	private static Scanner s;
	public static void Char(String str, char ch ) {
		int frequency =0;
		for(int i=0; i<str.length();i++) {
			if(ch==str.charAt(i)) {
				++frequency;
			}
		}
		System.out.println("The letter/digit "+ ch +" was found in the string/number " + frequency + " times.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		System.out.println("Enter string/number :");
		String str = s.nextLine();
		System.out.println("Enter letter/digit :");
		char ch = s.next().charAt(0);
		Char(str,ch);

	}

}
