package oops_inheritance;
import java.util.*;
public class Question11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter String :");
	String s  = sc.nextLine();
	String r1 = "";
	if(s.length()%2 == 0) {
		r1 = s.substring(0, s.length()/2);
	}else {
		System.out.print("null");
	}

	}

}
