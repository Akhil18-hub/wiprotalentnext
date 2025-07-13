package oops_inheritance;

import java.util.Scanner;

public class Question2 {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2); 
    }
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer base (num1) for powerInt: ");
        int intBase = scanner.nextInt();
        System.out.print("Enter an integer exponent (num2) for powerInt: ");
        int intExponent = scanner.nextInt();

        int intResult = powerInt(intBase, intExponent);
        System.out.println("Result of powerInt: " + intResult);
        System.out.print("Enter a decimal base (num1) for powerDouble: ");
        double doubleBase = scanner.nextDouble();
        System.out.print("Enter an integer exponent (num2) for powerDouble: ");
        int doubleExponent = scanner.nextInt();

        double doubleResult = powerDouble(doubleBase, doubleExponent);
        System.out.println("Result of powerDouble: " + doubleResult);

        scanner.close();
    }
}
