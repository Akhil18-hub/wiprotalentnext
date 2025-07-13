package java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Question25 {

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
          System.out.println (arr[0] + arr[1]);
          System.out.print (arr[n-1] + arr[n-2]);
	}

}
