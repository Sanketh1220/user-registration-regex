import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	
	static String fName;

	//uc-1 taking input from user
	static String firstName(){
		Scanner str1 = new Scanner(System.in);
		System.out.println("Enter your first name in ('S'anketh) format: ");
		fName = str1.nextLine();
		return fName;
	}

	public static void main(String args[]) {
		//welcome note for user
		System.out.println("Welcome to User Registration Problem!");

		//regex check for first name
		Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());
		
		//loop for incorrect entry
		while(firstName == false) {
			System.out.println("Error! Invalid input from user please enter your First-Name in valid format(ex-'S'anketh).");
			firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());
		}
		
		//printing the user input
		System.out.println("First Name: " + fName);
	}
}
