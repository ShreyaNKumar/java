import java.util.Scanner;

//public class Methods {
//	int balance;
//	public static void current(int balance){
//	
//		System.out.println("Your current balance is " + balance);
//		return;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		current(150);
//		
//	}
//
//}


//Addition

//public class Methods{
//	public static void add(int a, int b) {
//		int sum = a+b;
//		System.out.println(a + " + " + b + " = " + sum);
//      return;
//	}
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Addition of 2 numbers");
//		
//		System.out.println("\nEnter a number : ");
//		int a =  sc.nextInt();
//		
//		System.out.println("Enter another number : ");
//		int b =  sc.nextInt();
//		
//		add(a, b);
//		
//	}
//}


//Factorial

//public class Methods{
//	public static void fact(int num) {
//		int i, fact=1;
//		if(num == 0) {
//			System.out.println("0! = 1");
//		}
//		else {
//		   for(i=1 ; i<=num ; i++) {
//			   fact = fact*i;
//		   }
//		   
//		   System.out.println(num + "! = " + fact);
//		}
//		return;
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a positive integer: ");
//		
//		int num =  sc.nextInt();
//		
//		fact(num);
//		
//	}
//}

//import java.lang.Math;
//
//public class Methods {
//	public static void main(String[] args) {
//		// Implement your code here 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a positive integer: ");
//		int num = sc.nextInt();
//		int i;
//		for(i=0; i<5; i++){
//		    System.out.print((int)Math.pow(2, i) + " , ");
//		}
//	}
//}

public class Methods {
	public static void group(int[] a, int[] b) {
		int i;
		int[] arr=new int[Math.max(a.length, b.length)];
		
		for(i=0; i<arr.length; i++) {
			if(i>=a.length) {
				arr[i]= b[i];
			}
			else if(i>=b.length) {
				arr[i]= a[i];
			}
			else {
			arr[i] = a[i] + b[i];
			}
		}
		
		System.out.println("1st array elements");
		for(i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\n2nd array elements");
		for(i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println("\nresulting array elements");
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	public static void main(String[] args) {
		int a[] = {1, 2};
		int b[] = {3, 2, 4};
		
		group(a,b);
	}
}
