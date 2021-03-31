import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	public static void main(String args[]) {
	System.out.println("Welcome to User Registration Problem!");
	
	Scanner str = new Scanner(System.in);
	System.out.println("Enter your first name in ('S'anketh) format");
	String fName = str.nextLine();
	Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",fName);
	if(firstName == true) {
		System.out.println("First Name: " + fName);
	}else {
		System.out.println("Error! Invalid input from user please enter your First-Name in valid format(ex-'S'anketh).");
	}

	}
}
