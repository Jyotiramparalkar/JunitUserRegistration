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

    //UC-5 As a User need to follow pre-defined Password rules.

    @Test
    public void checking_8_characters_password_return_true()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean returnResult = userRegistration.password("Validate");
        Assert.assertTrue(returnResult);
    }

    @Test
    public void checking_More_than_8_character_password_return_false() {
        UserRegistration userRegistration = new UserRegistration();
        boolean returnResult = userRegistration.password("Sufficient");
        Assert.assertFalse(returnResult);
    }

    @Test
    public void checking_less_Than_8_character_password_return_false() {
        UserRegistration userRegistration = new UserRegistration();
        boolean returnResult = userRegistration.password("cool");
        Assert.assertFalse(returnResult);
    }
    // UC-6 Should have at least 1
    ///Upper Case - NOTE – All rules must be passed
    @Test
    public void checking_upperCase_character_password_return_true() {
        UserRegistration userRegistration = new UserRegistration();
        boolean returnResult = userRegistration.passwordRule2("Validate");
        Assert.assertTrue(returnResult);
    }

    @Test
    public void checking_without_uppercase_character_password_return_false() {
        UserRegistration userRegistration = new UserRegistration();
        boolean returnResult = userRegistration.passwordRule2("validate");
        Assert.assertFalse(returnResult);
    }
    //UC7 Rule3– Should have at least 1 number

    @Test
    public void Checking_with_numeric_character_password_return_true(){
        UserRegistration userRegistration = new UserRegistration();
        boolean returnResult= userRegistration.passwordRule3("Validate1");
        Assert.assertTrue(returnResult);
    }
    @Test
    public void Checking_without_numeric_character_password_return_false(){
        UserRegistration userRegistration = new UserRegistration();
        boolean returnResult= userRegistration.passwordRule3("Validate");
        Assert.assertFalse(returnResult);
    }
    // UC-8 Rule4 – Has exactly 1 Special Char
    @Test
    public void Checking_with_special_character_password_return_true (){
        UserRegistration userRegistration = new UserRegistration();
        boolean returnResult= userRegistration.passwordRule4("Validate1@");
        Assert.assertTrue(returnResult);
    }
    @Test
    public void Checking_without_special_character_password_return_false(){
        UserRegistration userRegistration = new UserRegistration();
        boolean returnResult= userRegistration.passwordRule4("Validate1");
        Assert.assertFalse(returnResult);
    }
}
