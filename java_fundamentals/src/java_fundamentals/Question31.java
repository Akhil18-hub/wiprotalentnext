package java_fundamentals;
import java.util.*;
public class Question31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
boolean verify = true;
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num != 1 && num != 4) {
                verify = false;
                break;
            }
        }
        System.out.println(verify);


	}

}
