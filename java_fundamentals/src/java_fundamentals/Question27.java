package java_fundamentals;
import java.util.Scanner;

public class Question27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[count++] = arr[i];
            }
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }

        sc.close();
    }
}
