package practice2;
import java.util.Arrays;
//public class Array10 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a[] = {1,2,2,3,3,4,5,6,7,8,6,9,6};
//		int k = 6;
//		int i,count=0;
//		Arrays.sort(a);
//		
//		for(i=0;i<a.length;i++) {
//			if(k==a[i]) {
//				++count;
//			}
//		}
//		System.out.println("The number " + k + " ocurred " + count+ " times." );
//
//	}
//
//}
//

//1 cyclic rotation

//public class Array10 {
//	public static void main(String[] args) {
//	int a[] = {1,2,3,4,5,6,7,8,9};
//	int b[]=new int[a.length];
//	int i;
//	for(i=0;i<a.length;i++) {
//		if(i==0) {
//			b[i]=a[a.length-1];
//		}
//		else {
//			b[i]=a[i-1];
//		}
//	}
//	for(i=0;i<a.length;i++) {
//		System.out.print(b[i]+" " );
//	}
//	}
//}

//2 cyclic rotations
//public class Array10 {
//	public static void main(String[] args) {
//	int a[] = {1,2,3,4,5,6,7,8,9};
//	int b[]=new int[a.length];
//	int i;
//	for(i=0;i<a.length;i++) {
//		if(i==0) {
//			b[i]=a[a.length-2];
//		}
//		else if(i==1) {
//			b[i]=a[a.length-1];
//		}
//		else {
//			b[i]=a[i-2];
//		}
//	}
//	for(i=0;i<a.length;i++) {
//		System.out.print(b[i]+" " );
//	}
//	}
//}

//find the missing number

//public class Array10 {
//	public static void main(String[] args) {
//		int a[]= {8,7,3,5,6,2,1};
//		Arrays.sort(a);
//		int i;
//		for(i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		
//		for(i=1;i<=a.length;i++) {
//			if(i!=a[i-1]) {
//				System.out.println("\nThe missing number in array is "+ i);
//				break;
//			}
//		}
//	}
//}



//public class Array10 {	
//
//	public static int maxWater(int[] arr, int n) 
//    { 
//  
//        // To store the maximum water 
//        // that can be stored 
//        int res = 0; 
//  
//        // For every element of the array 
//        // except first and last element 
//        for (int i = 1; i < n - 1; i++) { 
//  
//            // Find maximum element on its left 
//            int left = arr[i]; 
//            for (int j = 0; j < i; j++) { 
//                left = Math.max(left, arr[j]); 
//            } 
//  
//            // Find maximum element on its right 
//            int right = arr[i]; 
//            for (int j = i + 1; j < n; j++) { 
//                right = Math.max(right, arr[j]); 
//            } 
//  
//            // Update maximum water value 
//            res += Math.min(left, right) - arr[i]; 
//        } 
//        return res; 
//    } 
//  
//    // Driver code 
//    public static void main(String[] args) 
//    { 
//        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }; 
//        int n = arr.length; 
//  
//        System.out.print(maxWater(arr, n)); 
//    } 
//}

//class Test{
//	public void show() {
//		System.out.print("Hi"); 
//	}
//}
//class Array10{
//	public static void main(String[] args) {
//		Test obj = new Test();
//		obj.show();
//	}
//}


//public class Array10 {
//
//  public static void main(String[] args) {
//	int a[]= {1,2,3,2,1};
//	int k=5,i,j;
//	for(i=0;i<a.length;i++) {
//		for(j=i+1;j<a.length;j++) {
//			if(a[i]+a[j]==k) {
//				System.out.println(a[i] + "," + a[j]);
//				break;
//			}
//		}
//    }
//  }
//}

//if all variables in a class are private, the class is called as a tightly encapsulated class



