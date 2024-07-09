
public class Swap {

	public static void swap(int a, int b) {
		System.out.println("Before swaping, a=" + a + " b=" + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After swaping, a=" + a + " b=" + b);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(10,20);

	}

}
