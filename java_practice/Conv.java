import java.util.Scanner;
class Convertor{
	private static Scanner s;
	public void dhirams() {
		s = new Scanner(System.in);
		System.out.println("Enter rupees: ");
		float a = s.nextFloat();
		float dh = a*0.044f ;
		System.out.println("Dhirams :"+ dh);
	}
	public void dollars() {
		s = new Scanner(System.in);
		System.out.println("Enter rupees: ");
		float a = s.nextFloat();
		float dol = a*0.012f;
		System.out.println("Dollars :"+ dol);
	}
	public void euros() {
		s = new Scanner(System.in);
		System.out.println("Enter rupees: ");
		float a = s.nextFloat();
		float e = a*0.011f ;
		System.out.println("Euros :"+ e);
	}
}

class Conv {
	private static Scanner sc;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Convertor obj = new Convertor();
		 sc=new java.util.Scanner(System.in);
		 while(true){
			    System.out.println("Convert rupees into :");
	            System.out.println("1. Dhirams");
	            System.out.println("2. Dollars");
	            System.out.println("3. Euros");
	            System.out.println("4. Exit");
	            System.out.println ("Enter the choice: ");
	            int ch=sc.nextInt();
	            if (ch==1){
	                obj.dhirams();
	            }
	            else if(ch==2){
	                obj.dollars();
	            }
	            else if(ch==3){
	                obj.euros();
	            }
	            else {
	            	System.exit(0);
	            }
		
	      }

	}
	
}
