package java_fundamentals;
import java.util.*;

public class Question29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] input = new int[n];
        int[] result = new int[n];
        int index = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (input[i] == 10) {
                input[i] = 0;
            }
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

        System.out.println("Rearranged array (10s replaced with 0): " + Arrays.toString(result));

        scanner.close();
    }
}
