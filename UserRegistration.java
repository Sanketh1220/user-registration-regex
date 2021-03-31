import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

	static String fName;
	static String lName;
	static String email;
	static String pNum;
	static String password;

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
	
	//uc3 taking email as input from user
	static String emailId(){
		Scanner str3 = new Scanner(System.in);
		System.out.println("Enter your email ID in (abc.xyz@bl.co.in): ");
		email = str3.nextLine();
		return email;
	}

	//uc4 taking phone number as input from user
	static String phoneNum(){
      Scanner str4 = new Scanner(System.in);
      System.out.println("Enter your phone number in (ex- '91 9999999999'): ");
      pNum = str4.nextLine();
      return pNum;
   }

	//uc5 taking password from user
	static String passwordCheck(){
      Scanner str5 = new Scanner(System.in);
      System.out.println("Enter your password of atleast 8 characters): ");
      password = str5.nextLine();
      return password;
   } 

   public static void main(String args[]) {
      //welcome note for user
      System.out.println("Welcome to User Registration Problem!");

      //regex check for first name
      Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());

		//regex check for last name
      Boolean lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.lastName());

		//regex check for email
		Boolean emailId = Pattern.matches("^[a][b][c][.][a-z]{3}[@][b][l][.][c][o][.][a-z]{2}" ,UserRegistration.emailId());
		
		//regex check for phone number
      Boolean phoneNum = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}" ,UserRegistration.phoneNum());

		//regex check for password
      Boolean passwordCheck = Pattern.matches("^[a-zA-Z]{8,}" ,UserRegistration.passwordCheck());

      //loop for incorrect entry
      while(firstName == false) {
         System.out.println("Error! Invalid input from user please enter your First-Name in valid format(ex-'S'anketh).");
         firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.firstName());
      }

		while(lastName == false) {
         System.out.println("Error! Invalid input from user please enter your Last-Name in valid format(ex-'C'higurupalli).");
         lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegistration.lastName());
      }

		while(emailId == false) {
         System.out.println("Error! Invalid input from user please enter your email Id in valid format(ex-'abc.xyz@bl.co.in).");
         lastName = Pattern.matches("^[a][b][c][.][a-z]{3}@[b][l][.][c][o][.][a-z]{2}",UserRegistration.emailId());
      }
		
		while(emailId == false) {
			System.out.println("Error! Invalid input from user please enter your phone number in valid format(ex-'91 9999999999').");
			phoneNum = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}" ,UserRegistration.phoneNum());
		}

		while(emailId == false) {
         System.out.println("Error! Invalid input from user please enter your password in valid format(should contain atleast 8 characters).");
     		passwordCheck = Pattern.matches("^[a-z]{8,}" ,UserRegistration.passwordCheck());
		}

      //printing the user input
		System.out.println("-------------------------");
      System.out.println("First Name: " + fName);
		System.out.println("Last Name: " + lName);
		System.out.println("Email ID: " + email);
		System.out.println("Phone number: +" + pNum);
		System.out.println("Password: " + password);
		System.out.println("-------------------------");
	}
}
