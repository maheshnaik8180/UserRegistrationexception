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
            Assert.assertEquals(true, UserRegistration.isFirstNamevalid("Mahesh"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }


    @Test
    public void givenFirstName_WhenShort_ShouldReturnTrue() {
        try {

            Assert.assertEquals(false, UserRegistration.isFirstNamevalid("Ma"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }




    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {

            Assert.assertEquals(true, UserRegistration.isLastNameValid("Naik"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }


    @Test
    public void givenLastName_WhenShort_ShouldReturnTrue() {
        try {

            Assert.assertEquals(false, UserRegistration.isLastNameValid("Na"));
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }

}

