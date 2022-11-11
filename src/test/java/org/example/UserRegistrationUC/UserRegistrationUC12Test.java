package org.example.UserRegistrationUC;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationUC12Test {
    private UserRegistrationUC12 userRegistration;

    @Before
    public void setUp() throws Exception {
        userRegistration = new UserRegistrationUC12();
    }

    //checking for first name validation
    @Test
    public void givenFirstName_WhenValid_ThenTrue() throws UserRegistrationException {
        boolean result = userRegistration.validateFirstName.validate("Vivek");
        Assert.assertTrue(result);
        System.out.println("First Name is Valid");
        System.out.println(result);
    }

    // checking for first name validation
    @Test
    public void givenFirstName_WhenInvalid_ThenFalse() {
        try {
            boolean result = userRegistration.validateFirstName.validate("vivek");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid First Name", exception.getMessage());
            System.out.println("Invalid First Name");
        }

    }

    // checking for last name validation
    @Test
    public void givenLastName_WhenValid_ThenTrue() throws UserRegistrationException {
        boolean result = userRegistration.validateLastName.validate("Gujale");
        Assert.assertTrue(result);
        System.out.println("Last Name is Valid");
        System.out.println(result);
    }

    //checking for last name validation
    @Test
    public void givenLastName_WhenInvalid_ThenFalse() {
        try {
            boolean result = userRegistration.validateLastName.validate("gujale");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Last Name", exception.getMessage());
            System.out.println("Invalid last Name");
        }
    }


    // positive test case for email
    @Test
    public void givenEmailID_WhenValid_ThenTrue() throws UserRegistrationException {
        boolean result = userRegistration.validateEmail.validate("vdgujale07@gmail.com");
        Assert.assertTrue(result);
        System.out.println("Email Id is Valid");
        System.out.println(result);
    }

    // negative test case for email
    @Test
    public void givenEmailID_WhenInvalid_ThenFalse() {
        try {
            boolean result = userRegistration.validateEmail.validate("vdgujale07gmail.com");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Email", exception.getMessage());
            System.out.println("Invalid Email");
        }
    }

    // positive test case for mobile number
    @Test
    public void givenMobileNumber_WhenValid_ThenTrue() throws UserRegistrationException {
        boolean result = userRegistration.validateMobileNumber.validate("91 9876543210");
        Assert.assertTrue(result);
        System.out.println("Mobile Number is Valid");
        System.out.println(result);
    }

    // negative test case for mobile number
    @Test
    public void givenMobileNumber_WhenInvalid_ThenFalse() {
        try {
            boolean result = userRegistration.validateMobileNumber.validate("9876543210");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Mobile Number", exception.getMessage());
            System.out.println("Invalid Mobile Number");
        }
    }

    // positive test case for password
    @Test
    public void givenPassword_OnlyOneSpecialCharacter_WhenValid_ThenTrue() throws UserRegistrationException {
        boolean result = userRegistration.validatePassword.validate("Vivekg07@");
        Assert.assertTrue(result);
        System.out.println("Password is Valid");
        System.out.println(result);
    }

    // negative test case for password
    @Test
    public void givenPassword_OnlyOneSpecialCharacter_WhenInvalid_ThenFalse() {
        try {
            boolean result = userRegistration.validatePassword.validate("vivekg07@");
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Invalid Password", exception.getMessage());
            System.out.println("Invalid Password");
        }
    }
}