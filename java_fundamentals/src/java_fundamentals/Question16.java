package java_fundamentals;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = 10;
        int m = 99;

        System.out.println("Prime numbers between " + n + " and " + m + " are:");

        for (int i = n; i <= m; i++) {
            boolean isPrime = true;

            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
		// TODO Auto-generated method stub

	}

}