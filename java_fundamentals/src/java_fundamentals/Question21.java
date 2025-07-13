package java_fundamentals;
import java.util.*;
public class Question21 {

	public static void main(String[] args) {
		System.out.print("Enter number of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		int sum = 0;
		System.out.print("Enter " + n );
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			 sum = sum+arr[i];
			
		}
		 double d = (double) sum/n;
		System.out.println("sum =" + sum);	
		System.out.print("Averagr=" + d);	
	}
	}


