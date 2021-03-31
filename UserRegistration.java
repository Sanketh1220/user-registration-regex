import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

	static String fName;
	static String lName;

   //uc-1 taking first name as input from user
   static String firstName(){
      Scanner str1 = new Scanner(System.in);
      System.out.println("Enter your first name in ('S'anketh) format");
      fName = str1.nextLine();
      return fName;
   }

	//uc2 taking last name as input from user
	static String lastName(){
      Scanner str2 = new Scanner(System.in);
      System.out.println("Enter your last name in ('C'higurupalli) format");
      lName = str2.nextLine();
      return lName;
   }
	

   public static void main(String args[]) {
      //welcome note for user
      System.out.println("Welcome to User Registration Problem!");

      //regex check for first name
      Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());

		//regex check for last name
      Boolean lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.lastName());

      //loop for incorrect entry
      while(firstName == false) {
         System.out.println("Error! Invalid input from user please enter your First-Name in valid format(ex-'S'anketh).");
         firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());
      }

		while(lastName == false) {
         System.out.println("Error! Invalid input from user please enter your Last-Name in valid format(ex-'C'higurupalli).");
         lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.lastName());
      }

      //printing the user input
      System.out.println("First Name: " + fName);
		System.out.println("Last Name: " + lName);
		
	}
}
