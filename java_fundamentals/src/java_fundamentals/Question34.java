package java_fundamentals;
import java.util.*;
public class Question34 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of elements");
	int n = sc.nextInt();
	int [][] arr = new int[3][3];
	int [][] arr1 = new int[3][3];
	System.out.print("Enter each array of elements");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			arr[i][j] = sc.nextInt();
		}		
	}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
		
			
	}
	int max =  arr[0][0];
	for( int i=0;i<3; i++) {
		for(int j = 0;j<3;j++) {
			if(arr[i][j]> max) {
				arr[i][j] = max;
			}
			
		}
		
	}
	System.out.println( "largest = " + max);

	}

}
