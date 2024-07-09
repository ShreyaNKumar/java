package practice4;

import java.util.Arrays;
import java.util.Scanner;


public class prac2{
	public static void main(String[] args) {
		
		long phone = 1324432833l;
		float pi = 3.14f;
		char letter = '/';
		boolean isAdult = true;
		
		
		
		// Strings //
		
		//concatenate
		String name= "Shreya" ;
		String name1 = "Akshay" ;
		String name2 = name + " and " + name1;
		System.out.println(name2);
		String name4 = name1.concat(name2);
		
		//charAt
		System.out.println(name2.length());
		System.out.println(name2.charAt(0));
		
		//replace
		String name3 = name2.replace('a', 'b');
		System.out.println(name3);
		
		//substring
		System.out.println(name2.substring(0,6));
		
		
		
		// Array //
		
		int[] marks = new int[3];
		marks[0]= 97;
		marks[1]= 99;
		marks[2]= 98;
		
		int i=0;
		System.out.println(marks[i]);
		
		for(int j=0; j<3; j++) {
			System.out.println(marks[j]);
		}
		
		//length
		System.out.println(marks.length);
		
		//sort
		System.out.println("\n");
		System.out.println("Before sorting Array: ");
		for(int j=0; j<3; j++) {
			System.out.println(marks[j]);
		}
		
		//import Arrays class
		Arrays.sort(marks);
		
		System.out.println("\n");
		System.out.println("After sorting Array: ");
		
		for(int j=0; j<3; j++) {
			System.out.println(marks[j]);
		}
		
		// Another way of creating an Array
		
		int[] scores = {90, 84, 98, 85};
		System.out.println("\n");
		for(int j=0; j<4; j++) {
			System.out.println(scores[j]);
		}
		
		//2-D Array
		int[][] ages = {{1,2,3},{90, 84, 98}};
		
		for(int j=0; j<2; j++ ) {
			for(int k=0; k<3; k++) {
				System.out.print(ages[j][k]);
				System.out.print(" ");
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		
		
		// Casting //
		int p =100;
		p += 1;
		int fp = p + (int)18.0; // converting 18.0 to integer type
		System.out.println(fp);
		
		
		// Constants //
		int a = 10;
		a = 11;
		
		final int B = 12;
		// B = 13; will give error
		// Final constants should be written with upper-case letters
		
		
		// Math class //
		Math.max(5, 10);
		Math.min(5, 10);
		Math.random();
		int c = (int)(Math.random()*100);
		
		
		// Input //
		// Import Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("Enter your current age: ");
		int Age = sc.nextInt();
		
		Age = Age + 4;
		System.out.println("Your Age after 4 years : " + Age);
		
		//for a word Input use sc.next();
		//for a sentence use nextLine();
		
		int l=100;
		
		while(l>=1) {
			System.out.println(l);
			l--;
		}
		
		

		
		
	}
}