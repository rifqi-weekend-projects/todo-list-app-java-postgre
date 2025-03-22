package com.enigma.gosling.util;

public enum StatusOption {
    PENDING(1),
    COMPLETED(2);

    private int value;
    StatusOption(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public static StatusOption fromValue(int value) throws IllegalArgumentException {
        for (StatusOption option : StatusOption.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }
        throw new IllegalArgumentException("Invalid Status option. Please enter a valid number between 1 and " + StatusOption.values().length + ".");
    }
}
