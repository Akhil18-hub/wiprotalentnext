
package oops_inheritance;
import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.print("Enter number of times: ");
        int n = sc.nextInt();

        String r = s.substring(0, 2); 

        for (int i = 0; i < n; i++) {
            System.out.print(r); 
        }

      
    }
}
