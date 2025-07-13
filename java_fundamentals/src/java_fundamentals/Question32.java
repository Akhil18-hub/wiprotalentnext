package java_fundamentals;
import java.util.*;
public class Question32 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[] a = new int[3];
	        int[] b = new int[3];
	        System.out.println("Enter 3 elements for array a:");
	        for (int i = 0; i < 3; i++) {
	            a[i] = scanner.nextInt();
	        }
	        System.out.println("Enter 3 elements for array b:");
	        for (int i = 0; i < 3; i++) {
	            b[i] = scanner.nextInt();
	        }
	        int[] result = { a[1], b[1] };
	        System.out.println("Middle elements: " + Arrays.toString(result));

	        scanner.close();
	    }
	

	}


