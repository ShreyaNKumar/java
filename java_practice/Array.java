
//public class Array {
//	public static void main(String[] args) {
//	char[] a = {'a', 'b', 'c', 'd', 'e' };
//	
//	
//	for(int i=0; i<5; i++) {
//		System.out.println(a[i]);
//	}
//	}
//}





public class Array {
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