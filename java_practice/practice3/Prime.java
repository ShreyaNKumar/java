package practice3;

//Display prime numbers between 2 numbers
public class Prime {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50, b=100;
		while(a<b) {
			boolean flag = false;
			//condition of non-prime/composite
			for (int i=2; i<=a/2; ++i) {
				if(a%i==0) {
					flag = true;
					break;
				}
				
			}
			if(flag == false) {
				System.out.print(a+ " ");
			}
			++a;
		}
		

	}

}
