import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FundamentalTest {

    @Test
    void CheckGiven_FirstName_WhileCorrect_Return_Happy_WhileWrong_Return_Sad() {
        UserInputsValidator fName = new UserInputsValidator();
        String res = fName.firstName("Sanketh");
        String ress = fName.firstName("SANKETH");
        Assertions.assertEquals("HAPPY", res);
        Assertions.assertEquals("SAD", ress);
    }

    @Test
    void CheckGiven_LastName_WhileCorrect_Return_Happy_WhileWrong_Return_Sad() {
        UserInputsValidator lName = new UserInputsValidator();
        String  res1 = lName.lastName("Chigurupalli");
        String  res11 = lName.lastName("cHkasjJ");
        Assertions.assertEquals("HAPPY", res1);
        Assertions.assertEquals("SAD", res11);
    }

    @Test
    void CheckGiven_Email_WhileCorrect_Return_Happy_WhileWrong_Return_Sad() {
        UserInputsValidator eMail = new UserInputsValidator();
        String res2 = eMail.email("abc.abc@bl.co.us");
        String res22 = eMail.email("aXc.abc@bl.co.us");
        Assertions.assertEquals("HAPPY", res2);
        Assertions.assertEquals("SAD", res22);
    }

    @Test
    void CheckGiven_PhoneNumber_WhileCorrect_Happy_WhileWrong_Return_Sad() {
        UserInputsValidator phoneNum = new UserInputsValidator();
        String res3 = phoneNum.phoneNumber("91 9700488694");
        String res33 = phoneNum.phoneNumber("90909");
        Assertions.assertEquals("HAPPY", res3);
        Assertions.assertEquals("SAD", res33);
    }

    @Test
    void CheckGiven_Password_WhileCorrect_Happy_WhileWrong_Return_Sad() {
        UserInputsValidator passWord = new UserInputsValidator();
        String res4 = passWord.password("idenTical@11");
        String res44 = passWord.password("idenT11");
        Assertions.assertEquals("HAPPY" ,res4);
        Assertions.assertEquals("SAD" ,res44);
    }

}

