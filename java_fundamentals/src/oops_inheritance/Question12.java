package oops_inheritance;
import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String");
		String s = sc.nextLine();
		String r = "";
		if(s.length()>2) {
			r = s.substring(1,s.length()-1);
			System.out.print(r);
		}else {
			System.out.print("Enter required");
		}
	}

}
