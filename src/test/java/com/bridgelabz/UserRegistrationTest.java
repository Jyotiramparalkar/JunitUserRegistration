package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    @Test
    public void checking_if_invalid_first_name()
    {
        UserRegistration userRegistration = new UserRegistration();
        String firstName = "Jack";
        Assert.assertEquals("Jack",userRegistration.isFirstNameValid(firstName));

    }
    @Test
    public void checking_if_invalid_last_name()
    {
        UserRegistration userRegistration = new UserRegistration();
        String lastName = "Parker";
        Assert.assertEquals("Parker" , userRegistration.isLastNameValid(lastName));
    }

    @Test
    public void checking_if_invalid_mail_id()
    {
        UserRegistration userRegistration = new UserRegistration();
        String emailId = "parkarjack@gmail.com";
        Assert.assertEquals("parkarjack@gmail.com" , userRegistration.isEmailValid(emailId));
    }
    @Test
    public void checking_if_invalid_phone_number()
    {
        UserRegistration userRegistration = new UserRegistration();
        String phoneNumber = "914552114";
        Assert.assertEquals("914552114" , userRegistration.isPhoneNumberValid(phoneNumber));
    }


}
