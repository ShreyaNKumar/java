package practice3;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String args[]) {
        String original; 
        String reverse = "" ; // Objects of String class
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome :");
        original = s.nextLine();
        int len = original.length();  // Corrected to use the length() method
        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number isn't a palindrome.");
        }
    }
}
