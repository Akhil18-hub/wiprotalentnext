package java_fundamentals;
import java.util.*;
public class Question28 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter number of elements");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int sum =0;
		boolean skip = false;
		System.out.print("Enter numbers" + n);
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] == 6) {
				skip = true;
			}
			if(arr[i] != 6) {
				sum = sum+arr[i];
			}
			if(skip && arr[i] == 7) {
				skip = false;
			}
			
		}
		System.out.print("Sum = " + sum);
		
		

	}

}
