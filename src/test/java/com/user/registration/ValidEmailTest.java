package com.user.registration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {


    public String email2Test;
    public boolean expectedResult;

    public ValidEmailTest(String email, boolean expectedResult){
        this.email2Test = email;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc@%*.com", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com –", false}
        });
    }





    @Test
    public void givenEmailAsVar_ShouldReturnAsPerTheParameterizedResult(){
        UserRegistration user = new UserRegistration();
        boolean result = user.validateEmail(this.email2Test);
        Assert.assertEquals(this.expectedResult, result);
    }
}


