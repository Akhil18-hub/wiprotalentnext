package java_fundamentals;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet character: ");
        char ch = scanner.next().charAt(0); // Read first character of input

        if (Character.isLowerCase(ch)) {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        } else {
            System.out.println("Not a valid alphabet character.");
        }

        scanner.close();

	}

}
