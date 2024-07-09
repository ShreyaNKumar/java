
//public class Array1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = new int[5];
//		for(int i=0; i<5; i++) {
//			a[i]=i+1;
//		System.out.println(a[i]);
//		}
//
//	}
//
//}




//public class Array1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = new int[5];
//		int[] b = new int[5];
//		int[] c = new int[5];
//		
//		System.out.print("The elements of array a are: ");
//		for(int i=0; i<5; i++) {
//			a[i] = i;
//			System.out.print(a[i]+ " ");
//		}
//		
//		System.out.print("\nThe elements of array b are: ");
//		for(int i=0; i<5; i++) {
//			b[i] = i+5;
//			System.out.print(b[i]+ " " );
//		}
//		
//		System.out.print("\nAfter addition of both arrays, the elements of the new array are: ");
//		for(int i=0; i<5; i++) {
//			c[i] = a[i]+ b[i];
//			System.out.print(c[i] + " ");
//		}
//
//	}
//
//}





public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][3];
		int num = 1;
		System.out.println("The multi-dimensional array is:");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				a[i][j]= num;
				num++;
				System.out.print(a[i][j]+ " ");
			}
			System.out.print("\n");
		}

	}

}
