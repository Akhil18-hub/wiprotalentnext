package java_fundamentals;
import java.util.*;
public class Question23 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        System.out.print("Enter the number to search: ");
	        int searchNum = scanner.nextInt();

	        boolean found = false;

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter element " + i  + ": ");
	            int num = scanner.nextInt();

	            if (num == searchNum) {
	                System.out.println(i);  
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println(-1);  
	        }

	        scanner.close();

	}

}
