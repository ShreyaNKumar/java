package practice2;
// For 3 digit numbers

public class Armstrong {

	public static void armstrong(int num) {
		int unit = num%10;
		int first = unit*unit*unit;
		int num2 = num/10;
		int tens = num2%10;
		int second = tens*tens*tens;
		int hundreds = num2/10;
		int third = hundreds*hundreds*hundreds;
		int result = first + second + third;
		if (result == num) {
			System.out.println(num + " is an Armstrong number");
		}
		else {
			System.out.println(num + " is not an Armstrong number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong(171);
	}
   
}


 