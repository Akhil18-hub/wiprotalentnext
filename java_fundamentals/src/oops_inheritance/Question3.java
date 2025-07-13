package oops_inheritance;
class Author{
	String name;
	String email;
	char gender;
	public  Author(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
}
public class Question3 {

	public static void main(String[] args) {
		        Author a = new Author("J.K. Rowling", "jk@example.com", 'F');
		       
		        System.out.println("Author name: " + a.name);
		        System.out.println("Email: " + a.email);
		        System.out.println("Gender: " + a.gender);
		        Author b = new Author("J.K. Rowling", "jk@example.com", 'F');
		        System.out.println("Author name: " + b.name);
		        System.out.println("Email: " + b.email);
		        System.out.println("Gender: " + b.gender);
		    }
		

		 

	}


