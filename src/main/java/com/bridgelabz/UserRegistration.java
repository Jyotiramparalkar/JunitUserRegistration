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
}
