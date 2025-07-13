package oops_inheritance;
import java.util.*;

public class Question9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        
        String result;
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            b = b.substring(1); 
        }
        result = a + b;
        System.out.println("Result: " + result);

        sc.close();
    }
}
