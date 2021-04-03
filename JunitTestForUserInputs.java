package com.junittest;
//import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FundamentalTest {

    @Test
    void CheckGiven_FirstName_WhileCorrect_Return_Happy() {
        UserInputsValidator fName = new UserInputsValidator();
        String res = null;
        try {
            res = fName.firstName("Sanketh");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", res);
    }

    @Test
    void CheckGiven_FirstName_WhileWrong_Return_Message() {
        UserInputsValidator fName = new UserInputsValidator();
        String ress = null;
        try {
            ress = fName.firstName("SANKETH");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("SAD", ress);

    }

    @Test
    void CheckGiven_FirstName_WhileNull_Return_Message() {
        UserInputsValidator fName = new UserInputsValidator();
        try {
            fName.firstName(null);
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            Assertions.assertEquals(ExceptionForUserInputs.exceptionType.given_null_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }

    @Test
    void CheckGiven_FirstName_WhileEmpty_Return_Message() {
        UserInputsValidator fName = new UserInputsValidator();

        try {
            fName.firstName("");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            Assertions.assertEquals(ExceptionForUserInputs.exceptionType.given_empty_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }

    @Test
    void CheckGiven_LastName_WhileCorrect_Return_Happy() {
        UserInputsValidator lName = new UserInputsValidator();
        String  res1 = null;
        try {
            res1 = lName.lastName("Chigurupalli");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", res1);
    }

    @Test
    void CheckGiven_LastName_WhileWrong_Return_Sad(){
        UserInputsValidator lName = new UserInputsValidator();
        String  res11 = null;
        try {
            res11 = lName.lastName("cHkasjJ");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("SAD", res11);
    }

    @Test
    void CheckGiven_LastName_WhileNull_Return_Message() {
        UserInputsValidator lName = new UserInputsValidator();
        try {
            lName.lastName(null);
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            Assertions.assertEquals(ExceptionForUserInputs.exceptionType.given_null_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }

    @Test
    void CheckGiven_LastName_WhileEmpty_Return_Message() {
        UserInputsValidator lName = new UserInputsValidator();
        try {
            lName.lastName("");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            Assertions.assertEquals(ExceptionForUserInputs.exceptionType.given_empty_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }

    @Test
    void CheckGiven_Email_WhileCorrect_Return_Happy() {
        UserInputsValidator eMail = new UserInputsValidator();
        String res2 = null;
        try {
            res2 = eMail.email("abc.abc@bl.co.us");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", res2);
    }

    @Test
    void CheckGiven_Email_WhileWrong_Return_Sad() {
        UserInputsValidator eMail = new UserInputsValidator();
        String res22 = null;
        try {
            res22 = eMail.email("aXc.abc@bl.co.us");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("SAD", res22);
    }

    @Test
    void CheckGiven_Email_WhileNull_Return_Message() {
        UserInputsValidator eMail = new UserInputsValidator();
        try {
            eMail.email(null);
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            Assertions.assertEquals(ExceptionForUserInputs.exceptionType.given_null_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }

    @Test
    void CheckGiven_Email_WhileEmpty_Return_Message() {
        UserInputsValidator eMail = new UserInputsValidator();
        try {
            eMail.email("");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            Assertions.assertEquals(ExceptionForUserInputs.exceptionType.given_empty_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }


    @Test
    void CheckGiven_PhoneNumber_WhileCorrect_Happy() {
        UserInputsValidator phoneNum = new UserInputsValidator();
        String res3 = null;
        try {
            res3 = phoneNum.phoneNumber("91 9700488694");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", res3);
    }

    @Test
    void CheckGiven_PhoneNumber_WhileWrong_Return_Sad() {
        UserInputsValidator phoneNum = new UserInputsValidator();
        String res33 = null;
        try {
            res33 = phoneNum.phoneNumber("90909");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("SAD", res33);
    }

    @Test
    void CheckGiven_PhoneNumber_WhileNull_Return_Message() {
        UserInputsValidator phoneNum = new UserInputsValidator();
        try {
            phoneNum.phoneNumber(null);
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            Assertions.assertEquals(ExceptionForUserInputs.exceptionType.given_null_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }

    @Test
    void CheckGiven_PhoneNumber_WhileEmpty_Return_Message() {
        UserInputsValidator phoneNum = new UserInputsValidator();
        try {
            phoneNum.phoneNumber("");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            Assertions.assertEquals(ExceptionForUserInputs.exceptionType.given_empty_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }

    @Test
    void CheckGiven_Password_WhileCorrect_Happy() {
        UserInputsValidator passWord = new UserInputsValidator();
        String res4 = null;
        try {
            res4 = passWord.password("idenTical@11");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("HAPPY" ,res4);
    }

    @Test
    void CheckGiven_Password_WhileWrong_Return_Sad() {
        UserInputsValidator passWord = new UserInputsValidator();
        String res44 = null;
        try {
            res44 = passWord.password("idenT11");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            exceptionForUserInputs.printStackTrace();
        }
        Assertions.assertEquals("SAD" ,res44);
    }

    @Test
    void CheckGiven_Password_WhileNull_Return_Message() {
        UserInputsValidator passWord = new UserInputsValidator();
        try {
            passWord.password(null);
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            Assertions.assertEquals(ExceptionForUserInputs.exceptionType.given_null_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }

    @Test
    void CheckGiven_Password_WhileEmpty_Return_Message() {
        UserInputsValidator passWord = new UserInputsValidator();
        try {
            passWord.password("");
        } catch (ExceptionForUserInputs exceptionForUserInputs) {
            Assertions.assertEquals(ExceptionForUserInputs.exceptionType.given_empty_input, exceptionForUserInputs.type);
            exceptionForUserInputs.printStackTrace();
        }

    }

}
