package com.crimedata.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtil {

    // Method to check if a string is empty
    public static boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    // Method to validate email format
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
