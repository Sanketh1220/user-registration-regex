import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterisedEmailsTest {
    String emailsToBeChecked;
    Boolean expectedResultForEmail;

    public ParameterisedEmailsTest (String emailsToBeChecked, Boolean expectedResultForEmail) {
        this.emailsToBeChecked = emailsToBeChecked;
        this.expectedResultForEmail = expectedResultForEmail;
    }


    @Parameters
    public static Collection data() {
        return Arrays.asList( new Object [][]{
                {"abc@yahoo.com", true}, {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com", true}, {"abc111@abc.com", true},
                {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true}, {"abc@1.com", true}, {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},

                {"abc", false}, {"abc@.com.my", false}, {"abc123@gmail.a", false}, {"abc123@.com", false}, {"abc123@.com.com", false},
                {".abc@abc.com", false}, {"abc()*@gmail.com", false}, {"abc@%*.com", false}, {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false}, {"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au ", false}});
    }

    @Test
    public void GivenEmailSamples_IfSatisfiesRegex_GivesDesiredResult() {
        UserInputsValidator emailCheck = new UserInputsValidator();
        boolean emailResult = emailCheck.allEmailsCheck(this.emailsToBeChecked);
        Assertions.assertEquals(this.expectedResultForEmail, emailResult);
    }
}

