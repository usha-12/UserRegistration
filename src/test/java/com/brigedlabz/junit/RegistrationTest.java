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

}
