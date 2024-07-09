package practice3;


//Array

//public class Reverse {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = {1,2,3,4};
//		int[] b = new int[a.length];
//		for(int i=0; i<a.length ; i++) {
//			b[i] = a[a.length-1-i];
//			
//		}
//		
//		for(int i=0; i<b.length; i++) {
//			System.out.print(b[i] + " ");
//		}
//	}
//
//}






//String

public class Reverse{
	public static void main(String[] args) {
		String s = "String";
		String b= "";
		
		for(int i=0; i<s.length(); i++) {
			b = b+ s.charAt(s.length()-1-i);
		}
		
		System.out.println(b);
		
	}
}