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

}
