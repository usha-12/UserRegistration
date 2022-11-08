package com.brigedlabz.junit;

import java.util.regex.Pattern;
public class UserValidation {
    public static final String VALIDATE_NAME="^[A-z]+[a-z]{2,}$";
    public boolean checkFirstName(String firstName) {
        return (Pattern.matches(VALIDATE_NAME, firstName));
    }
}
/*As a User need to
enter a valid First
Name
- First name starts with Cap and has
minimum 3 characters*/