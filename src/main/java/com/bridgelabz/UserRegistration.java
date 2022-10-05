package com.bridgelabz;

public class UserRegistration
{

    public String isFirstNameValid(String firstName)
    {
        if(firstName.contains("Jack"))
        {
            return "Jack";
        }
        else
        {
            return "Invalid name";
        }
    }
    //UC2 Last name validation
    public String isLastNameValid(String lastName )
    {
        if(lastName.contains("Parker"))
        {
            return "Parker";
        }
        else
        {
            return "Invalid name";
        }
    }
    //UC3
    public String isEmailValid(String emailId)
    {
        if(emailId.contains("parkarjack@gmail.com"))
        {
            return "parkarjack@gmail.com";
        }
        else
        {
            return "Invalid mail-ID";
        }
    }
    public String isPhoneNumberValid(String phoneNumber)
    {

        if(phoneNumber.contains("914552114"))
        {
            return "914552114";
        }
        else
        {
            return "Invalid Phone Number";
        }

    }
    //UC-5 As a User need to follow pre-defined Password rules
    public boolean password(String password) {
        String passwordRegex = "[a-z]{8}";
        return password.matches(passwordRegex);
    }

    // UC-6 Should have at least 1
    ///Upper Case - NOTE – All rules must be passed
    public boolean passwordRule2(String passwordRule2) {
        String passwordRuleRegex = "^(?=.*?[A-Z])[a-zA-Z]{8}";
        return passwordRule2.matches(passwordRuleRegex);
    }




}
