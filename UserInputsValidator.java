import java.util.regex.Pattern;

public class UserInputsValidator {

    //Happy test cases
    static String firstName(String a){
        Boolean firstNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}",a);
        if (firstNameValidation == true) {
            System.out.println("Happy - First Name Test Case");
            return "HAPPY";
        }else {
            System.out.println("Sad - First Name Test Case");
            return "SAD";
        }
    }

    static String lastName(String b){
        Boolean lastNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}",b);
        if (lastNameValidation == true) {
            System.out.println("Happy - Last Name Test Case");
            return "HAPPY";
        }else {
            System.out.println("Sad - Last Name Test Case");
            return "SAD";
        }
    }

    static String email(String c){
        Boolean emailValidation = Pattern.matches("^[a][b][c][.][a-z]{3}@[b][l][.][c][o][.][a-z]{2}",c);
        if (emailValidation == true) {
            System.out.println("Happy - Email Test Case");
            return "HAPPY";
        }else {
            System.out.println("Sad - Email Test Case");
            return "SAD";
        }
    }

    static String phoneNumber(String d){
        Boolean phoneValidation = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}",d);
        if (phoneValidation == true) {
            System.out.println("Happy - Phone Number Test Case");
            return "HAPPY";
        }else {
            System.out.println("Sad - Phone Number Test Case");
            return "SAD";
        }
    }

    static String password(String e){
        Boolean passwordValidation = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}",e);
        if (passwordValidation == true) {
            System.out.println("Happy - Password Test Case");
            return "HAPPY";
        }else {
            System.out.println("Sad - Password Test Case");
            return "SAD";
        }
    }

    public boolean allEmailsCheck(String f) {
        Boolean emailCheck = Pattern.matches("^(?!\\.)[A-Za-z0-9]+([._%+-]?[0-9])*@[A-Za-z0-9-]+\\.[a-zA-Z]{2,6}(\\.[A-Za-z]{2,6})?$", f);
        return emailCheck;
    }
}

