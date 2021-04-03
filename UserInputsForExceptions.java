package com.junittest;

import java.util.regex.Pattern;

public class UserInputsValidator {

    //Happy test cases
    static String firstName(String a) throws ExceptionForUserInputs {
        Boolean firstNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}", a);
        try {
            if (a.length() == 0) {
                throw new ExceptionForUserInputs(ExceptionForUserInputs.exceptionType.given_empty_input, "You have entered invalid input");
            }
            if (firstNameValidation == true) {
                System.out.println("Happy - First Name Test Case");
                return "HAPPY";
            } else {
                System.out.println("Sad - First Name Test Case");
                return "SAD";
            }
        }catch (NullPointerException e){
            throw new ExceptionForUserInputs(ExceptionForUserInputs.exceptionType.given_empty_input, "You have entered null as input");
        }

    }
    static String lastName(String b) throws ExceptionForUserInputs {
        Boolean lastNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}", b);
        try {
            if (b.length() == 0) {
                throw new ExceptionForUserInputs(ExceptionForUserInputs.exceptionType.given_empty_input, "You have entered invalid input");
            }
            if (lastNameValidation == true) {
                System.out.println("Happy - Last Name Test Case");
                return "HAPPY";
            } else {
                System.out.println("Sad - Last Name Test Case");
                return "SAD";
            }

        } catch (NullPointerException e) {
            throw new ExceptionForUserInputs(ExceptionForUserInputs.exceptionType.given_empty_input, "You have entered null as input");
        }
    }

    static String email(String c) throws ExceptionForUserInputs {
        Boolean emailValidation = Pattern.matches("^[a][b][c][.][a-z]{3}@[b][l][.][c][o][.][a-z]{2}",c);
        try {
            if (c.length() == 0) {
                throw new ExceptionForUserInputs(ExceptionForUserInputs.exceptionType.given_empty_input, "You have entered invalid input");
            }
            if (emailValidation == true) {
            System.out.println("Happy - Email Test Case");
            return "HAPPY";
        }else {
            System.out.println("Sad - Email Test Case");
            return "SAD";
        }
        }
        catch (NullPointerException e) {
            throw new ExceptionForUserInputs(ExceptionForUserInputs.exceptionType.given_empty_input, "You have entered null as input");
        }
    }

    static String phoneNumber(String d) throws ExceptionForUserInputs {
        Boolean phoneValidation = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}",d);
        try {
            if (d.length() == 0) {
                throw new ExceptionForUserInputs(ExceptionForUserInputs.exceptionType.given_empty_input, "You have entered invalid input");
            }
            if (phoneValidation == true) {
                System.out.println("Happy - Phone Number Test Case");
                return "HAPPY";
            }else {
                System.out.println("Sad - Phone Number Test Case");
                return "SAD";
            }
        } catch (NullPointerException | ExceptionForUserInputs e) {
            throw new ExceptionForUserInputs(ExceptionForUserInputs.exceptionType.given_empty_input, "You have entered null as input");
        }
    }

    static String password(String pass) throws ExceptionForUserInputs {
        Boolean passwordValidation = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}", pass);
        try {
            if (pass.length() == 0) {
                throw new ExceptionForUserInputs(ExceptionForUserInputs.exceptionType.given_empty_input, "You have entered invalid input");
            }
            if (passwordValidation == true) {
                System.out.println("Happy - Password Test Case");
                return "HAPPY";
            }else {
                System.out.println("Sad - Password Test Case");
                return "SAD";
            }
        } catch (NullPointerException e) {
            throw new ExceptionForUserInputs(ExceptionForUserInputs.exceptionType.given_empty_input, "You have entered null as input");
        }
    }

    public boolean allEmailsCheck(String f) {
        Boolean emailCheck = Pattern.matches("^(?!\\.)[A-Za-z0-9]+([._%+-]?[0-9])*@[A-Za-z0-9-]+\\.[a-zA-Z]{2,6}(\\.[A-Za-z]{2,6})?$", f);
        return emailCheck;
    }
}

