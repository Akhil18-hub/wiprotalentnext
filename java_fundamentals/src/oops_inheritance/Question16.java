package oops_inheritance;

public class Question16 {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		String c =  String.valueOf(a.charAt(0))+b.charAt(0);
		String d = a.substring(1,a.length()-1)+b.substring(1,b.length()-1);
           System.out.print(c+d);
	}

}
//String c = String.valueOf(a.charAt(0)) + b.charAt(0);
