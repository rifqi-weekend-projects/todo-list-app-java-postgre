package com.enigma.gosling.util;

public enum SortByDateOption {
    ASC(1),
    DESC(2);

    private final int value;

    SortByDateOption(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static SortByDateOption fromValue(int value) {
        for (SortByDateOption option : SortByDateOption.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }
        throw new IllegalArgumentException("Invalid sort option: " + value);
    }
}
