//package practice4;
//
//public class format {
//
//	public static void main(String[] args) {
//		// Custom input string to be formatted
//        String str = "GeeksforGeeks";
// 
//        // Concatenation of two strings
//        String s
//            = String.format("My Company name is %s", str);
//		
//        System.out.println(s);
//
//
//	}
//
//}



package practice4;
import java.util.Scanner;

public class format {

	public static void main(String[] args) {
		//System.out.printf(format, arguments);
		System.out.printf("Hello %s!", "World");
		
		//To break the string into separate lines, we have a %n specifier:
		System.out.printf("baeldung%nline%nterminator");
		
		/*
		 * if the second argument is null, then the result is “false”.
		 * If the argument is a boolean or Boolean, then the result is the string returned by String.valueOf(arg). 
		 * Otherwise, the result is “true”.
		*/
		
		System.out.printf("%b%n", null);
		System.out.printf("%B%n", false);
		System.out.printf("%B%n", 5.3);
		System.out.printf("%b%n", "random text");
		
		Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d %n", s1, x);
        }
		
		//System.out.printf(locale, format, arguments);
		
	}
	
}