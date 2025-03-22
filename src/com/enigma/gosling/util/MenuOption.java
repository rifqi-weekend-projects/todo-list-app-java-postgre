package com.enigma.gosling.util;

public enum MenuOption {
    ADD_TASK(1),
    VIEW_TASK(2),
    UPDATE_TASK(3),
    REMOVE_TASK(4),
    SEARCH_BY_TITLE(5),
    EXIT(6);

    private final int value;

    MenuOption(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static MenuOption fromValue(int value) throws IllegalArgumentException {
        for (MenuOption option : MenuOption.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }
        throw new IllegalArgumentException("Invalid menu option. Please enter a number between 1 and " + MenuOption.values().length + ".");
    }
}
