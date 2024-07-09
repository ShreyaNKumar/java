package practice3;
import java.util.Scanner;

public class Powerof4 {
    public static boolean power0f4(int num) {
        int x = 1;
        boolean flag;
        while (x < num) {
            x *= 4;
        }
        if (x == num) {
            System.out.println(num + " is a power of 4.");
        	flag = true;
        	return flag;
        } 
        else {
            System.out.println(num + " is not a power of 4.");
            flag =false;
            return flag;
        }
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any integer :");
        int num = s.nextInt();
        boolean result = power0f4(num);
        System.out.println("Result :"+ result );
    }
}