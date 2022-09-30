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

}
