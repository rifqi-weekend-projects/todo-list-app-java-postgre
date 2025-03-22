package com.enigma.gosling;

import com.enigma.gosling.menu.MenuHandler;

public class ToDoListApp {

    public static void main(String[] args) {

        System.out.println("\n======== TO DO LIST APP ========");
        System.out.println("Welcome to my list application");

        MenuHandler.menu();

        MenuHandler.scanner.close();
    }
}
