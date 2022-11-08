package com.brigedlabz.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RegistrationTest {
    @BeforeAll
    static void displayMsg(){
        System.out.println("Welcome to user Registration");
    }
    @AfterEach
    public void afterMsgDisplay(){
        System.out.println("Passed");
    }
    @Test
    void given_first_name_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result = validation.checkFirstName("Deepa");
        Assertions.assertEquals(result, true);
    }
    @Test
    void given_last_name_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result1 = validation.checkLastName("Ahirwar");
        Assertions.assertEquals(result1, true);
    }
    @Test
    void given_email_id_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result2 = validation.checkEmailId("Ushaa.hirwar@gmail.com");
        Assertions.assertEquals(result2, true);
    }
    @Test
    void given_phoneNumber_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result3 = validation.phoneNumber("91 7974492321");
        Assertions.assertEquals(result3, true);
    }
    @Test
    void given_password_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result4 = validation.password("ushaahir");
        Assertions.assertEquals(result4, true);
    }

}
/*As a User need to
follow pre

-defined
Password rules.
Rule1

– minimum 8
Characters - NOTE – All rules must be passed*/