//package practice;
//
//public class Array {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int i,j;
//		int[][] first = {{1,2,3,4},{5,6,7}};
//		for(i=0; i<first.length ; ++i) {
//			for(j=0; j<first[i].length ; ++j) {
//				System.out.print(first[i][j]+ " ");
//			}
//			System.out.print("\n");
//		}
//		
//
//	}
//
//}


//import java.util.Scanner;
//public class Array {
//	private static Scanner s;
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		s = new Scanner(System.in);
//		System.out.println("Enter number of rows: ");
//		int m = s.nextInt();
//		System.out.println("Enter number of columns: ");
//		int n = s.nextInt();
//		int a[][] = new int[m][n];
//        int b[][] = new int[m][n];
//        
//		System.out.println("Enter elements of first matrix :");
//
//		for(int i=0; i<m ; ++i) {
//			for(int j=0; j<n ; ++j) {
//				a[i][j] = s.nextInt();
//			}
//		}
//		
//        System.out.println("Enter elements of second matrix :");
//
//		for(int i=0; i<m ; ++i) {
//			for(int j=0; j<n ; ++j) {
//				b[i][j] = s.nextInt();
//			}
//		}
//		
//		System.out.println("First matrix :");
//
//		for(int i=0; i<m ; ++i) {
//			for(int j=0; j<n ; ++j) {
//				System.out.print(a[i][j] + "  ");
//			}
//			System.out.print("\n");
//		}
//		
//		System.out.println("Second matrix :");
//
//		for(int i=0; i<m ; ++i) {
//			for(int j=0; j<n ; ++j) {
//				System.out.print(b[i][j] + "  ");
//			}
//			System.out.print("\n");
//		}
//		
//		int[][] sum = new int[m][n] ;
//		for(int i=0;i<m; i++) {
//			for (int j=0; j<n;j++) {
//				sum[i][j] = a[i][j] + b[i][j];
//			}
//		}
//		
//		System.out.println("Sum of both matrices is: ");
//		for(int i=0;i<m; i++) {
//			for (int j=0; j<n;j++) {
//				System.out.print(sum[i][j] + "  ");
//			}
//			System.out.print("\n");
//		}
//		
//		
//	}
//
//}

//import java.util.Scanner;
//public class Array {
//	private static Scanner s;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int a[][] = {{1,1},{1,1},{1,1}};
//        int b[][] = {{1,1,2},{1,1,2}};
//
//		int c[][] = new int[3][3];
//		int i,j,k;
//		for(i=0;i<3;i++) {
//			for(j=0;j<3;j++) {
//				c[i][j]=0;
//				for(k=0;k<2;k++) {
//					c[i][j]+= a[i][k]*b[k][j];
//					
//				}
//				System.out.print(c[i][j]+ " ");
//			}
//			System.out.println("\n");
//		}
//
//	}
//
//}

//public class Array {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
//		System.out.println("Original matrix: ");
//		int i,j;
//		for(i=0;i<3;i++) {
//			for(j=0;j<3;j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.print("\n");
//		}
//	    
//	
//	for(i=0;i<3;i++) {
//		for(j=i+1;j<3;j++) {
//			int v = a[i][j];
//			a[i][j] = a[j][i];
//			a[j][i] = v;
//		}
//		
//	}
//	
//	System.out.println("Transpose of the matrix: ");
//	
//	for(i=0;i<3;i++) {
//		for(j=0;j<3;j++) {
//			System.out.print(a[i][j] + " ");
//		}
//		System.out.print("\n");
//	}
//	
//}
//	
//
//}

//simple way to print transpose of a matrix;
//import java.util.Scanner;
//public class Array {
//	private static Scanner s;
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a[][] = {{1,2},{3,4},{5,6}};
//		System.out.println("Original matrix: ");
//		int i,j;
//		for(i=0;i<3;i++) {
//			for(j=0;j<2;j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.print("\n");
//		}
//		
//		System.out.println("Transpose of matrix: ");
//
//		for(i=0;i<2;i++) {
//			for(j=0;j<3;j++) {
//				System.out.print(a[j][i] + " ");
//			}
//			System.out.print("\n");
//		}
//
//		
//		
//	}
//
//}
package practice2;

//simple way to print transpose of a matrix;
import java.util.Scanner;
public class Array {
	private static Scanner s;

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		int a[][] = {{1,2},{3,4},{5,6}};
		System.out.println("Original matrix: ");
		int i,j;
		for(i=0;i<3;i++) {
			for(j=0;j<2;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("Transpose of matrix: ");

		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.print("\n");
		}

		
		
	}

}

