package practice2;
import java.lang.Math;
public class Power4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1,i;
		for(i=0;i<=num/2;i++) {
			if(Math.pow(4, i) == num) {
				System.out.println(num + " is a power of 4.");
				break;
			}
		}
		if(i>num/2) {
			System.out.println(num + " is not a power of 4.");
		}
		

	}

}
