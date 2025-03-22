package com.enigma.gosling.validation;

import java.util.Scanner;

public class InputValidation {

    public static int intValidation(String input) {

        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("Input cannot be empty or null");
        }

        if (!input.matches("-?\\d+")) {
            throw new IllegalArgumentException("Input must be a valid integer");
        }

        return Integer.parseInt(input);
    }

    public static String stringValidation(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("Input cannot be empty or null");
        }
        if (!input.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Input must contain only letters");
        }
        return input;
    }
}
