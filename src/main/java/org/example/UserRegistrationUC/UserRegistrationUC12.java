package org.example.UserRegistrationUC;

import java.util.regex.Pattern;

interface UserDetailsValidation {
    boolean validate(String x) throws UserRegistrationException;
}

public class UserRegistrationUC12 {

    UserDetailsValidation validateFirstName = firstName -> {

        // regex pattern for firstname
        if (Pattern.matches("[A-Z][a-z]{2,}", firstName))
            return true;
        else
            throw new UserRegistrationException("Invalid First Name");
    };

    UserDetailsValidation validateLastName = lastName -> {
        // regex pattern for lastname
        if (Pattern.matches("[A-Z][a-z]{2,}", lastName))
            return true;
        else
            throw new UserRegistrationException("Invalid Last Name");
    };

    UserDetailsValidation validateEmail = email -> {
        // regex pattern for email
        if (Pattern.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.,-]+", email))
            return true;
        else
            throw new UserRegistrationException("Invalid Email");
    };

    UserDetailsValidation validateMobileNumber = mobileNumber -> {
        // regex pattern for mobile number
        if (Pattern.matches("[91]{2}[ ][0-9]{10}", mobileNumber))
            return true;
        else
            throw new UserRegistrationException("Invalid Mobile Number");
    };

    UserDetailsValidation validatePassword = password -> {
        // regex pattern for password
        if (Pattern.matches("[A-Z][a-z]{4,}[0-9]{1,}[!@#^%&*]", password))
            return true;
        else
            throw new UserRegistrationException("Invalid Password");
    };
}
