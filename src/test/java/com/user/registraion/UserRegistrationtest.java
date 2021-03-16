package com.user.registraion;


import com.user.registration.UserRegistration;
import com.user.registration.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationtest {
    //---------------------First Name Null Exception Test  -------------------------------- //
    @Test
    public void givenFirstNameAsNull_ReturnException()
    {
        UserRegistration check = new UserRegistration();
        try {
            boolean firstName = check.checkFirstName(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, firstName);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullEnter, exception.type);
        }
    }
    //---------------------First Name Empty Exception Test --------------------------------
    @Test
    public void givenFirstNameAsEmpty_ReturnException()
    {
        UserRegistration check = new UserRegistration();
        try {
            boolean firstName = check.checkFirstName("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, firstName);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyEnter, exception.type);
        }
    }

    //---------------------Last Name Null Exception Test  --------------------------------
    @Test
    public void givenLastNameAsNull_ReturnException()
    {
        UserRegistration check = new UserRegistration();
        try {
            boolean lastName = check.checkLastName(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, lastName);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullEnter, exception.type);
        }
    }
    //---------------------Last Name Empty Exception Test --------------------------------
    @Test
    public void givenLastNameAsEmpty_ReturnException()
    {
        UserRegistration check = new UserRegistration();
        try {
            boolean lastName = check.checkLastName("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, lastName);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyEnter, exception.type);
        }
    }

    //---------------------Email Null Exception Test  --------------------------------
    @Test
    public void givenEmailAsNull_ReturnException()
    {
        UserRegistration check = new UserRegistration();
        try {
            boolean email = check.checkEmail(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, email);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullEnter, exception.type);
        }
    }
    //---------------------Email Empty Exception Test --------------------------------
    @Test
    public void givenEmailAsEmpty_ReturnException()
    {
        UserRegistration check = new UserRegistration();
        try {
            boolean email = check.checkEmail("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, email);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyEnter, exception.type);
        }
    }

    //---------------------Mobile number Null Exception Test  --------------------------------
    @Test
    public void givenMobileAsNull_ReturnException()
    {
        UserRegistration check = new UserRegistration();
        try {
            boolean mobile = check.checkMobile(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, mobile);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullEnter, exception.type);
        }
    }
    //---------------------Mobile Number Empty Exception Test --------------------------------
    @Test
    public void givenMobileAsEmpty_ReturnException()
    {
        UserRegistration check = new UserRegistration();
        try {
            boolean mobile = check.checkMobile("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, mobile);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyEnter, exception.type);
        }
    }

    //---------------------Password Null Exception Test  --------------------------------
    @Test
    public void givenPasswordAsNull_ReturnException()
    {
        UserRegistration check = new UserRegistration();
        try {
            boolean password = check.checkPasswordRule(null);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, password);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.NullEnter, exception.type);
        }
    }
    //---------------------Password Number Empty Exception Test --------------------------------
    @Test
    public void givenPasswordAsEmpty_ReturnException()
    {
        UserRegistration check = new UserRegistration();
        try {
            boolean password = check.checkPasswordRule("");
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserRegistrationException.class);
            Assert.assertEquals(true, password);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.EmptyEnter, exception.type);
        }
    }
}

