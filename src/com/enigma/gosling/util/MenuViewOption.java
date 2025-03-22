package com.enigma.gosling.util;

public enum MenuViewOption {
    VIEW_TASKS(1),
    VIEW_BY_STATUS(2),
    SORT_BY_DATE(3),
    BACK_TO_MAIN_MENU(4);

    private final int value;

    MenuViewOption(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public static MenuViewOption fromValue(int value) {
        for (MenuViewOption option : MenuViewOption.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }
        throw new IllegalArgumentException("Invalid value!");
    }
}
