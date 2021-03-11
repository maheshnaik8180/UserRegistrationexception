package com.user.registraion;


import com.user.registration.UserRegistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationtest {
private UserRegistration person ;

    @Before
    public void initalize (){
    person = new UserRegistration();
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {



            Assert.assertEquals(true, person.isFirstNamevalid("Mahesh"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }


    @Test
    public void givenFirstName_WhenShort_ShouldReturnTrue() {
        try {

            Assert.assertEquals(false, person.isFirstNamevalid("Ma"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }




    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {

            Assert.assertEquals(true, person.isLastNameValid("Naik"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }


    @Test
    public void givenLastName_WhenShort_ShouldReturnTrue() {
        try {

            Assert.assertEquals(false, person.isLastNameValid("Na"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        try {

            Assert.assertEquals(true, person.isEmailValid("abc.xyz@gmail.com"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }

    @Test
    public void givenEmail_WhenShort_ShouldReturnTrue() {
        try {

            Assert.assertEquals(false, person.isEmailValid("abc..xyz@gmail.com"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }

     @Test
     public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        try {

            Assert.assertEquals(true, person.isMobileNumberValid("91 8210029078"));
        }catch(Exception e) {
        System.out.println("Exception occured is " + e);
        }
        }

@Test
     public void givenPhoneNumber_WhenNotProper_ShouldReturnTrue() {
    try {

        Assert.assertEquals(false, person.isMobileNumberValid("918210029078"));
    }catch(Exception e) {
        System.out.println("Exception occured is " + e);
    }
}


    @Test
     public void givenPassword_WhenProper_ShouldReturnTrue() {
        try {

            Assert.assertEquals(true, person.isPasswordValid("Asad@12Sad"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }


    @Test
     public void givenPassword_WhenNotProper_ShouldReturnTrue() {
        try {

            Assert.assertEquals(false, person.isPasswordValid("AdjgdsS512S"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
}

