package java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		System.out.print("Enter number of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.print("Enter "+ n);
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
          Arrays.sort(arr);
          System.out.print("Sorted order" + Arrays.toString(arr));
	}
}
