package com.user.registraion;


import com.user.registration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationtest {


    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateFirstName("Mahesh");
        Assert.assertTrue(result);
    }


    @Test
    public void givenFirstName_WhenShort_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateFirstName("ma");
         Assert.assertFalse(result);

    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
       boolean result = user.validateLastName("Naik");
       Assert.assertTrue(result);


    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateLastName("naik");
        Assert.assertFalse(result);

    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateEmail("naikmahesh.naik@gmail.com");
        Assert.assertTrue(result);

    }

    @Test
    public void givenEmail_WhenShort_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateEmail("@gmail.com");
        Assert.assertFalse(result);

    }

     @Test
     public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
         UserRegistration user = new UserRegistration();
         boolean result = user.validatePhoneNumber("91 9087654321");
         Assert.assertTrue(result);
     }

     @Test
     public void givenPhoneNumber_WhenNotProper_ShouldReturnTrue() {
         UserRegistration user = new UserRegistration();
         boolean result = user.validatePhoneNumber("989832164");
         Assert.assertFalse(result);
     }


     @Test
     public void givenPassword_WhenProper_ShouldReturnTrue() {
         UserRegistration user = new UserRegistration();
         boolean result = user.validatePassword("Abcd#$%12345");
         Assert.assertTrue(result);

     }

     @Test
     public void givenPassword_WhenNotProper_ShouldReturnTrue() {
         UserRegistration user = new UserRegistration();
         boolean result = user.validatePassword("Ab1cd3434");
         Assert.assertFalse(result);
     }
 }

