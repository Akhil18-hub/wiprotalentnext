package oops_inheritance;
import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder b = new StringBuilder(s);
        String rev = b.reverse().toString();

        System.out.println("Reverse of string = " + rev);

        if (s.equals(rev)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

        sc.close();
    }
}
