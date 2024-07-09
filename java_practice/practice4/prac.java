package practice4;

import java.util.*;

public class prac {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (N % 2 != 0) {
            System.out.print("Weird");
        } else {
            if (N >= 2 && N <= 5) {
                System.out.print("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.print("Weird");
            } else if (N > 20) {
                System.out.print("Not Weird");
            }
        }
    }
}

//Daemon thread