package java_fundamentals;
import java.util.*;

public class Question30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] input = new int[n];
        int[] result = new int[n];
        int index = 0;

        // Input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        for (int num : input) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        for (int num : input) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        // Output
        System.out.println("Rearranged array: " + Arrays.toString(result));

        scanner.close();
    }
}
